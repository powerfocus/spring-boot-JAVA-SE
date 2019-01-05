package org.py.frames;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class HelloWorldSwing {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("HelloWorldSwing");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.gc();
                frame.dispose();
            }
        });

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        URL imgurl = ClassLoader.getSystemResource("images/timg.jpg");
        ImageIcon icon = new ImageIcon(imgurl, "显示一个图标");
        JLabel imglabel = new JLabel("image and text", icon, JLabel.CENTER);
        frame.getContentPane().add(imglabel);

        //frame.pack();
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}
