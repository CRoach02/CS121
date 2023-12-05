package weekSix.overLoaded;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        characterBuilder c1 = new characterBuilder();
        characterBuilder c2 = new characterBuilder("Warlock");
        characterBuilder charOne = new characterBuilder("Hunter", "Sun shot", 50, 30, 25);
        charOne.displayCharacter();
        characterBuilder charTwo = new characterBuilder("Titan", "Vorpal shield", 100, 30, 5);
        charOne.setHitPoints(charOne.getHitPoints(), charTwo.getMovePwr());
        charOne.printTest();
        charOne.setHitPoints(charOne.getHitPoints(), charTwo.getMovePwr());
        charOne.printTest();

    }


}