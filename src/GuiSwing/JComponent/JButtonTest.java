package GuiSwing.JComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JButtonTest {

    public static void main(String[] args) {

        // JButton = a button that performs an action when clicked on

        /*
          ActionListener: Captura e responde a eventos de ação, como cliques em botões

         ActionEvent: É um evento que represneta uma ação realizada(contém informações sobre
         o evento, como o componente que gerou o evento(ex:botão) e o tipo de ação(ex:clique)
        */


        ImageIcon imageIcon = new ImageIcon("src/GuiSwing/images/point-left.png");
        JFrameDefault jFrameDefault = new JFrameDefault();
        JButton jButton = new JButton();

        // setup text
        jButton.setFont(new Font("Arial", Font.BOLD, 18));
        jButton.setText("Click");
        jButton.setToolTipText("Click :D");
        jButton.setFocusable(false);

        // setup position
        jButton.setHorizontalTextPosition(JButton.LEFT);
        jButton.setVerticalTextPosition(JButton.CENTER);
        jButton.setBounds(275, 200, 250, 150);

        // setup icon
        jButton.setIcon(imageIcon);
        jButton.setIconTextGap(10);

        // setup style
        jButton.setBackground(Color.lightGray);
        jButton.setForeground(Color.BLACK);
        jButton.setBorder(BorderFactory.createEtchedBorder());
//        jButton.setEnabled(false);

        jButton.addActionListener(e -> {
            if(e.getSource() == jButton) {
                System.out.println("Java");
            }
        });

        jFrameDefault.add(jButton);
    }


}
