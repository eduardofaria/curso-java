package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();

        String sql = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
            //System.out.println("Nome:" + resultado.getString("nome"));
            System.out.println("O nome é: " + p.getNome());
            entrada.nextLine(); // DÚVIDA 1: Sem esse nextLine o prompt encerra a aplicação direto, sem me perguntar o novo nome, por que?

            System.out.print("Informe o novo nome: ");
            String novoNome = entrada.nextLine();
             sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
             stmt.close();
             PreparedStatement stmt2 = conexao.prepareCall(sql);
             stmt2.setString(1, novoNome);
             stmt2.setInt(2, codigo);
             stmt2.executeUpdate();

            System.out.println("Nome alterado com sucesso!");
            stmt.close();
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        conexao.close();
        entrada.close();
    }
}
