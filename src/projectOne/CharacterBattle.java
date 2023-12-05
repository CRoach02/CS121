package projectOne;

import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    static Scanner console = new Scanner(System.in);
    static Random rand = new Random();
    public static int roundTotal = 0, p1Win = 0, p2Win = 0;

    public static void main(String[] args) {
        //<>Main Game<>
        //Select rounds
        System.out.println("Enter the number of rounds you must win to win the battle");
        int roundInput = console.nextInt();
        int roundCap = (roundInput*2)-1;
        System.out.println("\nSince you entered "+roundInput+" rounds as the win condition,\n   you are playing to a best of "+roundCap+" rounds");
        console.nextLine();

        boolean gameRun = true;

        while(gameRun){
            if(roundTotal < roundCap && p1Win < roundInput && p2Win< roundInput) {
                roundTotal +=1;
                //Character Selection
                System.out.println("\n\t\tRound "+roundTotal);
                System.out.println("<=====================>\n");
                System.out.println("\t\tPlayer 1\n<=====================>");
                CharInfo player1 = CharSelect();
                System.out.println("\n\t\tPlayer 2\n<=====================>");
                CharInfo player2 = CharSelect();
                while(player1.getHitPoints() > 0 && player2.getHitPoints() > 0) {
                    //Character Battle
                    Battle(player1, player2);
                }
            }else{
                gameRun = false;
            }
        }
        System.out.println("\nRounds played: "+(p1Win+p2Win));
        System.out.println("Player 1 wins: "+p1Win);
        System.out.println("Player 2 wins: "+p2Win);
        if(p1Win > p2Win){
            System.out.println("\nPlayer 1 has won the battle!");
        }else{
            System.out.println("\nPlayer 2 has won the battle!");
        }
    }
    public static CharInfo CharSelect(){
        System.out.println("Please select a character");
        System.out.println("Your options are 'Hunter', 'Titan', or 'Warlock'");
        String character = console.nextLine().toLowerCase();
        switch (character) {
            case "hunter":
                CharInfo hunter = new CharInfo("Hunter", "Sun-shot", 50, 30, 25);
                return hunter;
            case "titan":
                CharInfo titan = new CharInfo("Titan", "Vorpal-shield", 100, 30, 5);
                return titan;
            case "warlock":
                CharInfo warlock = new CharInfo("Warlock", "Storm-caller", 75, 35, 20);
                return warlock;
            default:
                CharInfo hunter1 = new CharInfo("Hunter", "Sun-shot", 50, 30, 25);
                System.out.println("You typed an invalid input so your character has been set to hunter");
                return hunter1;
        }
    }
    public static void Battle(CharInfo player1, CharInfo player2){
        boolean p1 = false;
        if(player1.getAtkSpeed() == player2.getAtkSpeed()){
            int randNum = rand.nextInt(2);
            if(randNum == 0){
                p1 = true;
            }
        }
        if(player1.getAtkSpeed() > player2.getAtkSpeed() || p1){
            System.out.println("Player 1 ("+player1.getName()+") attacks player 2 ("+player2.getName()+") for "+player1.getMovePwr()+" damage using "+player1.getMove()+".");
            player2.setHitPoints(player2.getHitPoints(), player1.getMovePwr());
            if(player2.getHitPoints() <= 0){
                System.out.println("\nPlayer 2 has died\nPlayer 1 has won the round!");
                p1Win += 1;
                return;
            }
            System.out.println("Player 2 ("+player2.getName()+") attacks player 1 ("+player1.getName()+") for "+player2.getMovePwr()+" damage using "+player2.getMove()+".");
            player1.setHitPoints(player1.getHitPoints(), player2.getMovePwr());
            if(player1.getHitPoints() <= 0) {
                System.out.println("\nPlayer 1 has died\nPlayer 2 has won the round!");
                p2Win += 1;
            }
        }else{
            System.out.println("Player 2 ("+player2.getName()+") attacks player 1 ("+player1.getName()+") for "+player2.getMovePwr()+" damage using "+player2.getMove()+".");
            player1.setHitPoints(player1.getHitPoints(), player2.getMovePwr());
            if(player1.getHitPoints() <= 0) {
                System.out.println("\nPlayer 1 has died\nPlayer 2 has won the round!");
                p2Win += 1;
                return;
            }
            System.out.println("Player 1 ("+player1.getName()+") attacks player 2 ("+player2.getName()+") for "+player1.getMovePwr()+" damage using "+player1.getMove()+".");
            player2.setHitPoints(player2.getHitPoints(), player1.getMovePwr());
            if(player2.getHitPoints() <= 0) {
                System.out.println("\nPlayer 2 has died\nPlayer 1 has won the round!");
                p1Win += 1;
            }
        }
    }
}