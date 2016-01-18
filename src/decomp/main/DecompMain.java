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

        JButton button = new JButton("Decompile");
        button.setBounds(485, 365, 110, 25);

        JTextArea display = new JTextArea();
        display.setBounds(10, 10, 470, 380);
        display.setEditable(false);

        panel.add(button);
        panel.add(display);

        frame.setVisible(true);
    }

    public static void main(String argsp[])
    {
        new DecompMain();
    }

}
