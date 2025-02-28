package jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Step03_ResultSet {

    /* Representa um conjunto de resultados de uma consulta SQL.

        - Por padrão: Somente leitura e avança apenas para frente
        - Os valores podem ser acessados por índice(começanco em 1) ou nome da coluna
        - Na busca por nome, se houver colunas duplicadas, a primeira à esquerda será retornada
        - Mantém conexão ativa com o BD
     */

    private static final Logger logger = LogManager.getLogger(Step03_ResultSet.class);

    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();

        try {
            Statement stmt = connection.createStatement( // algumas flags

//          ResultSet.TYPE_FORWARD_ONLY // Permite apenas avançar p/ frente - default
//          ResultSet.CONCUR_READ_ONLY // Apenas leituras, sem suporte para atualizações - default
//          ResultSet.TYPE_SCROLL_SENSITIVE // Permite navager em ambas direções e reflete alterações feitas diretamente no BD enquanto a conexão estiver aberta
                    ResultSet.TYPE_SCROLL_INSENSITIVE, // Permite navegar em ambas direções e não reflete mudanças feitas diretamente no BD enquanto a conexão está aberta
                    ResultSet.CONCUR_UPDATABLE); // Permite modificar os dados diretamente no RS e refletir essas alterações no banco


            ResultSet resultSet = stmt.executeQuery("SELECT * FROM clients");

            logger.info("Row Absolute? '{}'", resultSet.absolute(2)); // move o cursor p/ a linha específicada
            logger.info("Row Number '{}'", resultSet.getRow());

            logger.info("Row First? '{}'", resultSet.first());
            logger.info("Row Number '{}'", resultSet.getRow());

            logger.info("Row Last? '{}'", resultSet.last());
            logger.info("Row Number '{}'", resultSet.getRow());

            logger.info("Row Relative? '{}'", resultSet.relative(-3)); // move o cursor
            logger.info("Row Number '{}'", resultSet.getRow());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
