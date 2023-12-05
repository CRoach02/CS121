package weekTwo;

import javax.swing.*;


public class DialogBox {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,name);
        System.out.println(name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,age);
        System.out.println(age);

        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your gpa: "));
        JOptionPane.showMessageDialog(null,gpa);
        System.out.println(gpa);
    }
}
