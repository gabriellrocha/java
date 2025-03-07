package GuiSwing.Container.JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrameTest {

    public static void main(String[] args) {

        // JFrame = a GUI window to add components

        JFrame jFrame = new JFrame();
        jFrame.setTitle("Application");
        jFrame.setSize(640, 640);
//        jFrame.setResizable(false);                                 // redimensionável
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      // define o comportamento de fechamento

//        jFrame.getContentPane().setBackground(Color.GRAY);
        jFrame.getContentPane().setBackground(new Color(169, 169, 169));

        jFrame.setVisible(true);            // se 'false', oculta o componente sem fechá-lo ou destruí-lo
    }
}
