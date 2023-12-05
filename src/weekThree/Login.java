package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String user1 = ("cs121student");
        String password1 = ("cs121activity");
        String user2 = JOptionPane.showInputDialog("Enter your username.");
        String password2 = JOptionPane.showInputDialog("Enter your password.");

        boolean u = user1.equals(user2);
        boolean p = password1.equals(password2);

        if(u == true && p == true)
            System.out.println("Welcome to CS121.");
        if (u == false && p == true)
            System.out.println("Your username is incorrect.");

        if (u == true && p == false)
            System.out.println("Your password is incorrect.");

        if (u == false && p == false)
            System.out.println("Both your password and username is incorrect.");
    }
}
