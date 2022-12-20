package pattern.observer;

import java.awt.*;
import javax.swing.*;

public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {

        frame = new JFrame();

        JButton button = new JButton("Should I go for it?");

        button.addActionListener(event -> System.out.println("DO NOT DO IT"));
        button.addActionListener(event -> System.out.println("DO IT"));

        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

}
