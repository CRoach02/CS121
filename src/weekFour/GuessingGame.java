package weekFour;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        int max = 100;
        int min = 1;
        int guesses = 0;


        int randNum = random.nextInt((max - min) + 1) + min;
        System.out.println("Correct number: "+randNum);

        System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up:");
        String guess = console.nextLine();
        //String number = Integer.toString(guess);

        while(!guess.equals("q")){
            //System.out.println("TEST");
            int num = Integer.parseInt(guess);
            //num = console.nextInt();
            guesses += 1;
            if(num == randNum) {
                System.out.println("Correct!\nNumber of guesses: " + guesses);
                return;
            }
            else{
                if (num > randNum) {
                    System.out.println("Too high. Guess again: ");

                }
                else{
                    System.out.println("Too low. Guess again: ");
                }
                guess = console.nextLine();
            }
        }
        System.out.println("Quitter! The number was "+randNum+".");
    }
}
