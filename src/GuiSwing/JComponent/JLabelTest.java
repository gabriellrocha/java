package GuiSwing.JComponent;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelTest {

    public static void main(String[] args) {

        // JLabel =  a GUI display to area for string of text, an image or both


        ImageIcon imageIcon = new ImageIcon("src/GuiSwing/images/java-coffee.png");
        Border lineBorder = BorderFactory.createLineBorder(Color.blue, 5);

        JLabel jLabel = new JLabel();

        jLabel.setText("Hello World!");
        jLabel.setIcon(imageIcon);
                                                                    // the text position is relative to the icon
        jLabel.setHorizontalTextPosition(JLabel.CENTER);             // set text LEFT, RIGTH OR CENTER of 'imageIcon'
        jLabel.setVerticalTextPosition(JLabel.TOP);                  // set text TOP, BOTTOM OR CENTER of 'imageIcon'

        jLabel.setHorizontalAlignment(JLabel.CENTER);               // set horizontal position of icon+text
        jLabel.setVerticalAlignment(JLabel.CENTER);                 // set vertical position of icon+text

        jLabel.setForeground(new Color(0, 0, 255));          // set font color of text
        jLabel.setFont(new Font("Arial", Font.BOLD, 20)); // name, style and size
        jLabel.setIconTextGap(50);                                  // set gap of text to image
        jLabel.setBackground(Color.yellow);
        jLabel.setOpaque(true);                                     // display background color
        jLabel.setBorder(lineBorder);
//        jLabel.setBounds(0, 0, 350, 350);    // set x,y position and size of the component within its container


        // Container

        JFrame jFrame = new JFrame("App");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(640, 640);
//        jFrame.setLayout(null);                                     // layout manager of JFrame(or any other Component)
        jFrame.add(jLabel);
//        jFrame.pack();
    }
}
