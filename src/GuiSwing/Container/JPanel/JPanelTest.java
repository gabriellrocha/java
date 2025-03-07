package GuiSwing.Container.JPanel;

import javax.swing.*;
import java.awt.*;

public class JPanelTest {

    public static void main(String[] args) {

        // JPanel = a GUI component that functions as a container to hold components


        ImageIcon imageIcon = new ImageIcon("src/GuiSwing/images/joinha.png");
        JLabel jLabel = new JLabel();
        jLabel.setText("OK!");
        jLabel.setIcon(imageIcon);
        jLabel.setBounds(100, 200, 75, 75);

        JPanel redJPanel = new JPanel();
        redJPanel.setBackground(Color.RED);
        redJPanel.setBounds(0, 0, 250, 750);
        redJPanel.setLayout(null);
        redJPanel.add(jLabel);


        JPanel greenJPanel = new JPanel();
        greenJPanel.setBackground(Color.GREEN);
        greenJPanel.setBounds(250, 0, 250, 750);

        JPanel blueJPanel = new JPanel();
        blueJPanel.setBackground(Color.BLUE);
        blueJPanel.setBounds(500, 0, 250, 750);


        // Container
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(new Dimension(750, 750));
        jFrame.setVisible(true);

        jFrame.add(redJPanel);
        jFrame.add(greenJPanel);
        jFrame.add(blueJPanel);


    }
}
