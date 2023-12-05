package weekNine;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //added an array length variable to make altering the array easier
        int aLength = 3;

        String[] make = new String[aLength];
        String[] model = new String[aLength];
        int[] year = new int[aLength];

        for (int i = 0; i < aLength; i++){
            System.out.println("Manufacturer: ");
            make[i] = console.nextLine();
            System.out.println("Model: ");
            model[i] = console.nextLine();
            System.out.println("Model year: ");
            year[i] = console.nextInt();
            console.nextLine();
        }
        System.out.println("Manufacturer \tModel \t\t\tYear");
        for(int i=0; i < make.length; i++){
            System.out.printf("%-12s \t%-13s \t%-8d\n", make[i], model[i], year[i]);
        }
        console.close();
    }
}
