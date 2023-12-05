package javaPlayground;

import javax.swing.*;

public class Button {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Name");
        JPanel button1 = new JPanel();

        int gameStatus;
        gameStatus = JOptionPane.showConfirmDialog(null, "Start game?");
        System.out.println(gameStatus);
    }
}
