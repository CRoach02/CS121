package weekEleven.sortingActivity;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    Scanner console = new Scanner(System.in);
    public int[] getArray(){
        int[] num = new int[5];
        System.out.println("Please enter 5 unsorted integers");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter integer "+(i+1)+":");
            num[i] = console.nextInt();
        }
        return num;
    }
    public int[] sortArray(int[] input){
        int temp;
        for(int i=0; i<input.length-1; i++){
            for(int j=0; j<input.length-i-1; j++){
                if(input[j]>input[j+1]){
                    temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }return input;
    }
}
