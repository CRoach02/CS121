package javaPlayground;

import javax.swing.JFrame;
import javax.swing.JTextPane;

public class javaTextPlayground {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.setSize(1920,1080);
        JTextPane pane = new JTextPane();
        pane.setContentType("text/html");
        pane.setText("<html><b>This is some text!</b><html>");
        frame.add(pane);
        frame.setVisible(true);
    }
}
