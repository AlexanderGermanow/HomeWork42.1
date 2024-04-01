package number1;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton button1 = new JButton("Simple Button #1");
        JButton button2 = new JButton("Simple Button #2");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyWindow();
    }
}