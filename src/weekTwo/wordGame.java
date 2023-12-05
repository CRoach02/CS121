package weekTwo;

import javax.swing.*;

public class wordGame {
    public static void main(String[] args) {

        //name
        String name = JOptionPane.showInputDialog("Enter your name");
        //JOptionPane.showMessageDialog(null,name);

        //age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        //JOptionPane.showMessageDialog(null,age);

        //city
        String city = JOptionPane.showInputDialog("Enter your city");
        //JOptionPane.showMessageDialog(null,city);

        //college
        String college = JOptionPane.showInputDialog("Enter your college");
        //JOptionPane.showMessageDialog(null,college);

        //major
        String major = JOptionPane.showInputDialog("Enter your major");
        //JOptionPane.showMessageDialog(null,major);

        //animal
        String animal = JOptionPane.showInputDialog("Enter your animal");
        //JOptionPane.showMessageDialog(null,animal);

        //pet name
        String petName = JOptionPane.showInputDialog("Enter your pet's name");
        //JOptionPane.showMessageDialog(null,petName);

        JOptionPane.showMessageDialog(null, "There once was a person named "+name+" who lived in "+city+".\n" +
                "At the age of "+age+", "+name+" went to college at "+college+".\n"+name+" graduated with a "+major+" degree. \nThen, "+name+" adopted a(n) "+
                animal+" named "+petName+".\nThey both lived happily ever after!");
    }
}
