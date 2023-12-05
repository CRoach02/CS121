package weekFour;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int students = console.nextInt();

        System.out.println("Enter the number of tests per student");
        int tests = console.nextInt();

        int score = 0;
        for(int i = 1; i <= students; i++){
            System.out.println("\nStudent number "+i);
            System.out.println("------------------");
            score = 0;
            for(int ii = 1; ii <= tests; ii++){
                System.out.print("Enter score "+ii+": ");
                score += console.nextInt();
            }
            System.out.printf("The Average for Student %d is %.2f\n",i, ((double)score/(double)tests));

        }
    }
}
