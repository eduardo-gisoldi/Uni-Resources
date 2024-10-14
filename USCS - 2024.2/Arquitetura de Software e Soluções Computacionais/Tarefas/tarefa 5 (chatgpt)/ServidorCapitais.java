import java.io.*;
import java.net.*;

public class ServidorCapitais {
    // Tabela de capitais e países
    private static String[][] capitaisPaises = {
        {"Itália", "Roma"}, {"França", "Paris"}, {"Espanha", "Madrid"}, 
        {"Alemanha", "Berlim"}, {"China", "Pequim"}, {"Portugal", "Lisboa"},
        {"Rússia", "Moscou"}, {"Suíça", "Berna"}, {"Áustria", "Viena"}, 
        {"Egito", "Cairo"}
    };

    public static void main(String[] args) throws IOException {
        // Servidor escutando na porta 8080
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Servidor rodando...");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Ler o nome do país enviado pelo cliente
            String pais = in.readLine();
            String capital = getCapitalByPais(pais); // Busca a capital

            // Envia a resposta para o cliente
            out.println(capital != null ? capital : "País não encontrado");

            clientSocket.close();
        }
    }

    // Método que retorna a capital do país
    private static String getCapitalByPais(String pais) {
        for (String[] entry : capitaisPaises) {
            if (entry[0].equalsIgnoreCase(pais)) {
                return entry[1];
            }
        }
        return null;
    }
}
