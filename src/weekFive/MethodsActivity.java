package weekFive;

import java.util.Scanner;

public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double l = getLength();
        double w = getWidth();
        display(l, w, getArea(l, w));

        scanner.close();
    }
    public static double getLength(){
        System.out.println("Enter the length of your rectangle");
        return scanner.nextDouble();
    }
    public static double getWidth(){
        System.out.println("Enter the width of your rectangle");
        return scanner.nextDouble();
    }
    public static double getArea(double l, double w){
        return (l*w);
    }

    public static void display(double l, double w, double a) {
        System.out.printf("rectangle length: %.1f \nrectangle length: %.1f \nrectangle area: %.1f", l, w, a);
    }


}
