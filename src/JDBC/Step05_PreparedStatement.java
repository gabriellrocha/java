package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Step05_PreparedStatement {

    /* Representa uma instrução SQL pré-compilada
        - Protege contra sql injection
        - Usa placeholders (?) para definir parâmetros
    */

    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();

        try (PreparedStatement pstm = connection.prepareStatement("SELECT * FROM clients WHERE id = ?")) {

            pstm.setInt(1, 9);
            ResultSet resultSet = pstm.executeQuery();

            resultSet.next();
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            System.out.println(new Client(id, name));
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
