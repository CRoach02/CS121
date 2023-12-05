package weekFour;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        String color = "red";
        int correct = 0;

        for(int i = 1; i <=10; i++){
            int randNum = rand.nextInt(5);
            if(randNum == 1){
                color = "green";
            }if(randNum == 2){
                color = "blue";
            }if(randNum == 3){
                color = "orange";
            }if(randNum == 4){
                color = "yellow";
            }if(randNum == 0){
                color = "red";
            }
            System.out.println(i+". What color has the computer chosen?");
            String guess = console.nextLine().toLowerCase();
            System.out.println("The computer chose "+color);
            if(color.equals(guess)) {
                correct += 1;
            }
        }
        System.out.println("You got "+correct+" out of 10 correct");
    }
}

