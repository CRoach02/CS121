package weekThree;

import javax.swing.*;

public class Triangles {
    public static void main(String[] args) {
        int side1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the first side"));
        int side2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the second side"));
        int side3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the third side"));
        if(side1 == side2 && side1 == side3) {
            System.out.println("Equilateral: All sides are equal.");
        } else {
            if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles: Two sides have the same length.");
            }else{
                System.out.println("Scalene: All sides have different lengths.");
            }
        }
    }
}
