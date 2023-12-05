package weekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try{
            //create an instance of the fileWriter and printWriter class
            FileWriter filewrite = new FileWriter("cars", true);
            PrintWriter output = new PrintWriter(filewrite);

            String manufacturer = JOptionPane.showInputDialog("Enter manufacturer");
            String model = JOptionPane.showInputDialog("Enter car model");
            int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the model year"));
            int mpg = Integer.parseInt(JOptionPane.showInputDialog("Enter miles per gallon (mpg)"));
            int tSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter top speed"));
            output.printf("%n%s %s %d %d %d", manufacturer, model, year, mpg, tSpeed);
            filewrite.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("Error message");
        }
    }
}
