package weekTwo;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int numOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter the 2nd number");
        int numTwo = Integer.parseInt(console.nextLine());
        int add = (numOne + numTwo);
        int sub = (numOne - numTwo);
        int multi = (numOne * numTwo);
        int div = (numOne / numTwo);
        //sqrt1
        double sqrt1 = Math.sqrt(numOne);
        System.out.printf("The number %d + %d = %d",numOne,numTwo,add);
        System.out.printf("\nThe number %d - %d = %d",numOne,numTwo,sub);
        System.out.printf("\nThe number %d * %d = %d",numOne,numTwo,multi);
        System.out.printf("\nThe number %d / %d = %d",numOne,numTwo,div);
        System.out.printf("\nThe square root of %d is = %.2f",numOne,sqrt1);
        double power = Math.pow((double)numOne, (double)numTwo);
        System.out.printf("\nThe power of %d and %d is: %f",numOne,numTwo,power);
        //2nd number print
        double log1 = Math.log(numOne);
        System.out.printf("\nThe log of %d is: %.2f",numOne,log1);

    }
}
