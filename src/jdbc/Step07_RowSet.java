package jdbc;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;
import java.util.Properties;

public class Step07_RowSet {

    private static final Properties properties = ConnectionFactory.getProperties();

    /*
        Estenda a Interface ResulSet, mas com funcionalidades adicionais para facilitar a manipulação de dados.
        Ao contrário de ResulSet, que é ligado a uma conexão ativa, um RowSet pode ser desconectado
        Segue o padrão JavaBean, sendo config através de setters
        Abstraí a necessidade de gerenciar manualmente a conexão e o ResultSet
    */

    public static void main(String[] args) throws SQLException {

        Client client = findById(9);
        updateNameUpperCase(client);
    }

    private static Client findById(int id) {

        final String SQL = "SELECT * FROM clients WHERE id = ?";

        try (JdbcRowSet jdbcRowSet = getJdbcRowSet()) {

            jdbcRowSet.setCommand(SQL);
            jdbcRowSet.setInt(1, id);
            jdbcRowSet.execute();
            jdbcRowSet.next();

            Client client = new Client(
                    jdbcRowSet.getInt("id"),
                    jdbcRowSet.getString("name"));

            return client;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void updateNameUpperCase(Client client) throws SQLException {

        final String SQL = "SELECT * FROM clients WHERE id = ?";

        try (JdbcRowSet jdbcRowSet = getJdbcRowSet()) {

            jdbcRowSet.addRowSetListener(new CustomRowSetListener());

            jdbcRowSet.setCommand(SQL);
            jdbcRowSet.setInt(1, client.getId());
            jdbcRowSet.execute();

            jdbcRowSet.next();

            jdbcRowSet.updateString("name", client.getName().toUpperCase());

            jdbcRowSet.updateRow(); // sincroniza alterações feitas numa linha com o BD


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static JdbcRowSet getJdbcRowSet() throws SQLException {

        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();

        jdbcRowSet.setUrl(properties.getProperty("jdbcUrl"));
        jdbcRowSet.setUsername(properties.getProperty("username"));
        jdbcRowSet.setPassword(properties.getProperty("password"));

        return jdbcRowSet;
    }


    private static CachedRowSet getCachedRowSet() throws SQLException {

        CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();

        cachedRowSet.setUrl(properties.getProperty("jdbcUrl"));
        cachedRowSet.setUsername(properties.getProperty("username"));
        cachedRowSet.setPassword(properties.getProperty("password"));

        return cachedRowSet;
    }
}


