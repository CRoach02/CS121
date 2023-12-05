package weekTwo;

import java.util.Scanner;

public class IntDiv {
    public static void main(String[] args) {
        //Creating an istance of the scanner class
        //print name
        Scanner console = new Scanner(System.in);

 //Strings
        String color = "blue";
        System.out.println("Enter your name");
        String name = console.nextLine();
        System.out.println(name);

        //.nextInt()
        System.out.println("Enter age :");
        int age = console.nextInt();
        System.out.println(age);

        //.nextDouble()
        System.out.println("Enter gpa :");
        double gpa = console.nextDouble();
        System.out.println(gpa);

        //shortcut print
        int numOne = 1;
        int numTwo = 4;
        int numThree = 28;
        double numFour = 3.145;
        double numBase = 1.00;
        double result = (double)numOne/(double)numTwo;

        //System.out.print(result);
        //System.out.print(numThree/numBase);

        //closes out your scanner
        console.close();
    }
}
