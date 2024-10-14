import java.sql.*;

public class ServidorCapitaisBD {
    // Método que retorna a capital de um país a partir do banco de dados
    private static String getCapitalByPais(String pais) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "usuario", "senha");
        PreparedStatement stmt = connection.prepareStatement("SELECT capital FROM CapitaisPaises WHERE pais = ?");
        stmt.setString(1, pais);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getString("capital");
        }
        return null;
    }
}
