package weekTen;

import java.util.Scanner;

public class RecursionLoopMethod {
    Scanner console = new Scanner(System.in);

    public void countDown(int input){
        while(input!=0){
            System.out.print(input+"...");
            input--;
        }
        System.out.println("Blast Off!");
    }
    public void alphaBackwards(char input){
        while(input!='a'){
            System.out.print(input+" ");
            input--;
        }
        System.out.println(input);
    }
}
