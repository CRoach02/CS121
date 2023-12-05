package weekNine;

import java.util.Scanner;

public class SocialMediaSimulation {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int pAmount = 2;
        String[] postContent = new String[pAmount];
        int[] pLikes = new int[pAmount];
        int[] pComments = new int[pAmount];

        String[][] posts = new String[pAmount][];

        for(int i=0; i < pAmount; i++){
            System.out.println("Enter post "+(i+1)+" content");
            postContent[i] = console.nextLine();
            System.out.println("Enter the number of likes for post "+(i+1));
            pLikes[i] = console.nextInt();
            System.out.println("Enter the number of comments found on post "+(i+1));
            pComments[i] = console.nextInt();
            console.nextLine();
        }
        for(int i = 0; i < pAmount; i++){
            posts[i] = new String[]{postContent[i], String.valueOf(pLikes[i]), String.valueOf(pComments[i])};
        }
        System.out.printf("%-18s %-11s %4s\n", "Post Content", "Likes", "Comments");
        for (String[] f: posts){
            System.out.printf("%-16s %2s %12s\n", f[0], f[1], f[2]);
        }
        for(int i=0; i < pAmount; i++){
            System.out.println("How many likes were added for Post "+(i+1));
            pLikes[i] += console.nextInt();
            System.out.println("How many more comments were made for Post "+(i+1));
            pComments[i] += console.nextInt();
        }
        for(int i=0; i < pAmount; i++){
            posts[i][1] = String.valueOf(pLikes[i]);
            posts[i][2] = String.valueOf(pComments[i]);
        }
        System.out.printf("%-18s %-11s %4s\n", "Post Content", "Likes", "Comments");
        for (String[] f: posts){
            System.out.printf("%-16s %2s %12s\n", f[0], f[1], f[2]);
        }
    }
}
