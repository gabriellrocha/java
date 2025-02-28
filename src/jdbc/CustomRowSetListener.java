package jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

    /* Permite ouvir eventos em objetos RowSet
        - Fornece métodos para responder a mudanças em um RowSet

    */

public class CustomRowSetListener implements RowSetListener {

    private static final Logger logger = LogManager.getLogger(CustomRowSetListener.class);


    @Override
    public void rowSetChanged(RowSetEvent rowSetEvent) {
        // chamado quando o ROwSet é atualizado ou modificado
        logger.info("Command execute");
    }

    @Override
    public void rowChanged(RowSetEvent rowSetEvent) {
        // chamado quando uma linha do RowSet é modificada, inserida ou excluída

        logger.info("Row inserted, updated or deleted");
        if (rowSetEvent.getSource() instanceof RowSet) {
            try {
                ((RowSet) rowSetEvent.getSource()).execute(); // garante que mudanças sejam refletidas no RowSet a partir do BD

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent rowSetEvent) {
        // chamado quando cursor do RowSet se move
        logger.info("Cursor Moved");

    }
}
