package weekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\cvr2n\\OneDrive\\Desktop\\CS 121\\CS121\\course");

        try{
            Scanner console = new Scanner(file);
            String header = console.nextLine();
            while(console.hasNextLine()) {
               /* //variables
                String line = console.nextLine();
                System.out.println(line);*/
                String course = console.next();
                int credits = Integer.parseInt(console.next());
                int score = Integer.parseInt(console.next());
                System.out.printf("%-7s %3d %7d \n", course, credits, score);
            }
            console.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            /* Custom error message:
            System.err.println(" FILE not found, check your path");
            */
        }
    }
}
