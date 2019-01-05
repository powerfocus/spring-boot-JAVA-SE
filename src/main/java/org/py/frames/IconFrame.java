package org.py.frames;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class IconFrame {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("显示图标");
        frame.setResizable(false);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.gc();
                frame.dispose();
            }
        });

        URL imgurl = ClassLoader.getSystemResource("images/timg.jpg");
        ImageIcon icon = new ImageIcon(imgurl, "icon");
        JLabel imglabel = new JLabel(icon, JLabel.CENTER);
        frame.getContentPane().add(imglabel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}
