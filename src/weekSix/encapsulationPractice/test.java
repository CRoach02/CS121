package weekSix.encapsulationPractice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //character create
        System.out.println("Enter the name of your character");
        String charName = console.nextLine();
        System.out.println("Enter your character's move name");
        String charMove = console.nextLine();
        System.out.println("Enter your character's hit points");
        int charHitPoints = console.nextInt();
        System.out.println("Enter your character's power");
        int charMovePwr = console.nextInt();
        System.out.println("Enter your character's attack speed");
        int charAtkSpeed = console.nextInt();

        charInfo charOne = new charInfo(charName, charMove, charHitPoints, charMovePwr, charAtkSpeed);
        charOne.displayCharInfo();
    }

}
