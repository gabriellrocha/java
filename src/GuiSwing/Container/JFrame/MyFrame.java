package GuiSwing.Container.JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

//    private Dimension minimumDimension = new Dimension(640, 640);

    public MyFrame() {

        this.setTitle("Application");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(640, 640));
        this.getContentPane().setBackground(Color.lightGray);
//        this.setResizable(false);
        this.setVisible(true);

    }
}
