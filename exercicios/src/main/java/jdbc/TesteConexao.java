package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; // "Se diferente da porta 3306 -> jdbc:mysql://localhost:3307" Os parâmetros ?SSL& são opcionais.
        final String usuario = "root";
        final String senha = "12345678";
// jdbc:mysql://localhost:3306/agenda -> para conectar a um db específico do servidor
        Connection conexao = DriverManager
                .getConnection(url, usuario, senha);

        System.out.println("Conectado com sucesso!");
        conexao.close();
    }
}
