package weekFour;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter number of years");
        int years = console.nextInt();

        int months = 0;
        int inches = 0;

        for (int i = 1; i <= years; i++) {
            months += 12;
            for (int j = 1; j <= 12; j++) {
                System.out.println("Enter the inches of rainfall for year "+i+" month "+j);
                inches += console.nextInt();
            }
        }
        double avgInches = (double)inches/(double)months;
        System.out.println("Number of months: "+months);
        System.out.println("Total inches of rainfall: "+inches);
        System.out.printf("Average rainfall per month for %d years: %.2f", years, avgInches);
    }
}
