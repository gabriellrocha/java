package JDBC;

import java.sql.*;

public class Step04_ResultSetMetaData {

    // Metadados sobre as colunas que estão no ResultSet retornado pela query

    public static void main(String[] args) throws SQLException {


        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement()) {

            final String sql = "SELECT * FROM clients";

            ResultSet resultSet = statement.executeQuery(sql);

            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                System.out.println(metaData.getColumnName(i));
                System.out.println(metaData.getColumnTypeName(i));
                System.out.println(metaData.isNullable(i));
            }

        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
