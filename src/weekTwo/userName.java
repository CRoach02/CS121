package weekTwo;

import javax.swing.*;

public class userName {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your first and last name");
        JOptionPane.showMessageDialog(null,name.toUpperCase());
        JOptionPane.showMessageDialog(null,name.toLowerCase());
        System.out.println(name);
        //JOptionPane.showMessageDialog(null,name)

         //StringBuilder reversedName = new StringBuilder(name);
         //System.out.println(reversedName.reverse());
        //JOptionPane.showMessageDialog(null,reversedName.reverse());

        String rev = "";
        for(int i = name.length()-1; i>=0; i--)
            rev = rev + name.charAt(i);
        JOptionPane.showMessageDialog(null, rev);
    }
}
