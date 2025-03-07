package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Step02_Statement {

    /*  Usado p/ executar uma instrução SQL estática e retornar os resultados

        Statement só pode ter um ResultSet aberto por vez(se executar uma consulta com o mesmo Stmt, o
        ResultSet anterior é fechado automaticamente)

        Quando um Statement/PreparedStatement é fechado, ele automaticamente fecha qualquer ResulSet
        associado a ele.
    */

    public static void main(String[] args) throws SQLException {

        String sql = "INSERT INTO clients (name) VALUES ('James Gosling')";

        Connection connection = ConnectionFactory.getConnection();

        try (Statement statement = connection.createStatement()) {

            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Rows Affected " + rowsAffected);
        }

        connection.close();
    }
}
