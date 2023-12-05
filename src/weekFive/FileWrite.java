package weekFive;

import javax.swing.*;
import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        try{
            //create an instance of the fileWriter and printWriter class
            //FileWriter filewrite = new FileWriter("cars", true);
            PrintWriter output = new PrintWriter("cars");
            output.print("manufacturer model year mpg speed");
            String manufacturer = JOptionPane.showInputDialog("Enter manufacturer");
            String model = JOptionPane.showInputDialog("Enter car model");
            int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the model year"));
            int mpg = Integer.parseInt(JOptionPane.showInputDialog("Enter miles per gallon (mpg)"));
            int tSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter top speed"));
            output.printf("%n%s %s %d %d %d", manufacturer, model, year, mpg, tSpeed);
            output.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("Error message");
        }
    }
}
