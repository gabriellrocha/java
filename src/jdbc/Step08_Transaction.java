package jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Step08_Transaction {

    /*
     Transação em BD é um conjunto de operações SQL que são executadas como uma unidade atômica.
     Pode ser confirmada(Commit) para persistir as mudanças ou desfeita(Rollback) em caso de erro
     */


    private final static Logger logger = LogManager.getLogger(Step08_Transaction.class);

    public static void main(String[] args) throws InterruptedException {

        Client[] clients = {
                new Client(null, "Gabriel"),
                new Client(null, "Maria"),
                new Client(null, "Rebeca"),
                new Client(null, "Joaquim")
        };

        System.out.println(clients.length);
        saveInTransactionalContext(clients);


    }

    private static void saveInTransactionalContext(Client... clients) throws InterruptedException {

        final String SQL = "INSERT INTO clients (name) VALUES (?)";


        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement pstm = connection.prepareStatement(SQL)) {

            connection.setAutoCommit(false);

            for (Client client : clients) {

                String clientName = client.getName();

                pstm.setString(1, clientName);
                pstm.executeUpdate();
                logger.info("Saving Client: '{}'", clientName);
                Thread.sleep(2000); // simulating work
            }

            connection.commit();
            logger.info("All clients were saved successfully - Commit");

        } catch (SQLException e) {
            logger.error("A problem occurred. Undoing operations - Rollback");
            throw new RuntimeException(e);
        }

    }
}
