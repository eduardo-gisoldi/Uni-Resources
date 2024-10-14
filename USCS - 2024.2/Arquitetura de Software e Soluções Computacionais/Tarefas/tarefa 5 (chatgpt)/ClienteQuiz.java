import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteQuiz {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[][] capitaisPaises = {
            {"Itália", "Roma"}, {"França", "Paris"}, {"Espanha", "Madrid"}, 
            {"Alemanha", "Berlim"}, {"China", "Pequim"}, {"Portugal", "Lisboa"},
            {"Rússia", "Moscou"}, {"Suíça", "Berna"}, {"Áustria", "Viena"}, 
            {"Egito", "Cairo"}
        };

        // Loop pelas perguntas
        for (int i = 0; i < capitaisPaises.length; i++) {
            System.out.println("Qual é a capital do país " + capitaisPaises[i][0] + "?");
            String respostaUsuario = scanner.nextLine();

            // Conectar ao servidor na porta 8080
            Socket socket = new Socket("localhost", 8080);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Enviar o nome do país para o servidor
            out.println(capitaisPaises[i][0]);

            // Receber a capital correta do servidor
            String respostaServidor = in.readLine();

            // Comparar resposta do usuário com a do servidor
            if (respostaUsuario.equalsIgnoreCase(respostaServidor)) {
                System.out.println("Correto!");
            } else {
                System.out.println("Errado! A resposta correta é: " + respostaServidor);
            }

            socket.close();
        }

        scanner.close();
    }
}
