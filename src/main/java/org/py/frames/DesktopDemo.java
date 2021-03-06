package org.py.frames;

import javax.swing.*;

public class DesktopDemo {
    private JPanel mPanel;
    private JTextField uriTextField;
    private JButton launchBrowserButton;
    private JTextField emailTextField;
    private JButton launchMailButton;
    private JRadioButton openRadioButton;
    private JRadioButton editRadioButton;
    private JRadioButton printRadioButton;
    private JTextField fileTextField;
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
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
