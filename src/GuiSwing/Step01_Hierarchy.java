package GuiSwing;

import javax.swing.*;
import java.awt.*;

public class Step01_Hierarchy {

    public static void main(String[] args) {

        Component component;
        /* Classe base p/ todos os componentes visuais que podem ser exibidos na interface gráfica.
            Principais características:
            - Controla posição/tamanho do componente na interface
            - Gerencia como o componente é desenhado na tela(renderização)
            - Registra e lida com eventos (cliques, digitação, movidento de mouse)
            - Controla se o componente está visível e se está opaco
        */

        Container container = new Container();
        /* Classe base p/ componentes que podem acomodar outros componentes
            - Gerencia o layout e o agrupamento de componentes
        */


        Window window;
        /* Herda de Container, Classe base p/ componentes de nível superior que representam uma janela de nível independete na interface gráfica
        */

        JFrame jFrame = new JFrame();
        /* Herda de Window, proporciona uma janela com características mais avançadas
        */

        JDialog jDialog = new JDialog();
        /* Herda de Window, especializada p/ criar janelas de diálogo. Pode ser modal ou não-modal
            - Modal: O dialogo impede que interaja com a janela principal até que que o diálogo seja fechado
            - Não modal: O diálogo permite interação com a janela principal enquanto ele esta aberto
        */

        JPanel jPanel = new JPanel();
        /* Herda de Container, Usado p/ agrupar e organizar componentes dentro de uma janela
          - Servir de container p/ outros componentes
          - Usado p/ dividir a interface em seções, tornando o design modular e organizado
        */

        JComponent jComponent;
        /* Herda de Component, Classe base p/ todos os componentes visuais individuais(ou seja, exceto contêiners)
         */
    }
}
