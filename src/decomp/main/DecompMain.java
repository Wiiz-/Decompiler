package decomp.main;

import javax.swing.*;
import java.awt.*;

public class DecompMain
{

    public DecompMain()
    {
        JFrame frame = new JFrame("Decompiler");
        JPanel panel = (JPanel) frame.getContentPane();
        frame.setSize(new Dimension(600, 400));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        JButton button = new JButton("OK");
        button.setBounds(100, 100, 100, 25);
        panel.add(button);

        frame.setVisible(true);
    }

    public static void main(String argsp[])
    {
        new DecompMain();
    }

}
