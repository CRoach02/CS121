package weekTwelve.setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class socialMediaFollowersSet {
    Scanner console = new Scanner(System.in);
    Set<String> followers = new HashSet<>();
    public void addFollowers(){
        System.out.println("Enter the follower's username, or enter '0' to quit: ");
        String userName = console.nextLine();
        while(!userName.equals("0")){
            followers.add(userName);
            System.out.println("Enter the follower's username, or enter '0' to quit: ");
            userName = console.nextLine();

        }
    }
    public void displayTables(){
        Iterator<String> iterator = followers.iterator();
        System.out.println("Followers' Usernames:");
        while(iterator.hasNext()){
            String follower = iterator.next();
            System.out.println(follower);
        }
    }
}
