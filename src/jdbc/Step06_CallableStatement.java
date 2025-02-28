package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Step06_CallableStatement {

    /* CallableStatement: Usado para executar procedimentos armazenados no banco de dados
       Procedure:(stored procedures - Procedimento armazenado) Bloco de comandos sql que
        executa uma ação no BD e aceita parâmetros de entrada
     */

    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();

        final String sql = "CALL my_proc(?)";

        try (CallableStatement callableStatement = connection.prepareCall(sql)) {
            callableStatement.setInt(1, 9);
            ResultSet resultSet = callableStatement.executeQuery();
            resultSet.next();
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            System.out.println(new Client(id, name));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
