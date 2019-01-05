package org.py.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesktopDemo {
    private JPanel mPanel;
    private JTextField uriTextField;
    private JButton launchBrowserButton;
    private JTextField textField2;
    private JButton launchMailButton;
    private JRadioButton openRadioButton;
    private JRadioButton editRadioButton;
    private JRadioButton printRadioButton;
    private JTextField textField3;
    private JButton browseButton;
    private JButton launchApplicationButton;
    private JPanel cPanel;

    private void evt() {
        launchBrowserButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "你点击了一个按钮", "系统消息", JOptionPane.INFORMATION_MESSAGE));
    }
    public DesktopDemo() {
        evt();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DesktopDemo");
        frame.setContentPane(new DesktopDemo().mPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
