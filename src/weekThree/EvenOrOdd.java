package weekThree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        //number
        System.out.println("Enter your first number.");
        int num = console.nextInt();
        System.out.println(num);
        //even odd test
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
