package weekTen.RecursionActivity;

import java.util.Scanner;

public class RecursionTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Recursion test = new Recursion();

        System.out.println("Enter an integer");
        int num = Integer.parseInt(console.nextLine());
        System.out.println(test.countDown(num));

        System.out.println("Enter a letter of the alphabet");
        char letter = console.nextLine().toLowerCase().charAt(0);
        System.out.println(test.alphaBackwards(letter));
    }
}
