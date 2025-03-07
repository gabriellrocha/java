package JDBC;

import java.sql.*;

    /*  Connection - Representa uma conexão(sessão) com um banco de dados específico

        - Possui informações sobre o BD ao qual está conectado(tabelas, gramática sql suportada, etc)
        - Por padrão está no modo auto-commit
        - É uma fábrica de Statement, PreparedStatement, DataBaseMetaData
        - Fornece métodos p/ gerenciamento de transações

        Etapas p/ conexão:
        - Register Driver (não necessário em Java 6+)
        - Get Connection (DriverManager.getConnection() ou um pool de conexões(mais performático))
        - Create Statement/PreparedStatement - consulta parametrizada
        - Execute query
        - Close connection (fechar Connection, Statement, ResultSet) p/ liberar recursos
     */

public class Step01_Connection {

    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM authors");

        DatabaseMetaData metaData = connection.getMetaData(); // metadados sobre o banco e conexão

        String sqlKeywords = metaData.getSQLKeywords();// palavras-chave suportadas pelo BD
        System.out.println(sqlKeywords);

        // Fechar connection -> fecha Statemente -> fecha ResultSet
        // Fechar ResultSet sozinho não fecha nada além dele
        connection.close();
    }
}


