package weekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("C:\\Users\\cvr2n\\OneDrive\\Desktop\\CS 121\\CS121\\cars");


        try {
            Scanner console = new Scanner(text);
            String header = console.nextLine();
            System.out.println("\nManufacturer \tModel \t\t\tYear \t\tMPG \tTop Speed");
            while (console.hasNextLine()) {
                String manufacturer = console.next();
                String model = console.next();
                int year = Integer.parseInt(console.next());
                int mpg = Integer.parseInt(console.next());
                int speed = Integer.parseInt(console.next());
                //System.out.print(manufacturer+"\t\t"+model+"\t"+year+"\t\t"+mpg+"\t\t"+speed+"\n");
                System.out.printf("%-12s \t%-13s \t%-8d \t%d \t\t%d \n", manufacturer, model, year, mpg, speed);
            }
            console.close();
        }catch(FileNotFoundException e){
            System.err.println(" FILE not found, check your path");
        }
    }
}
//C:\Users\cvr2n\OneDrive\Desktop\CS 121\CS121\carsText