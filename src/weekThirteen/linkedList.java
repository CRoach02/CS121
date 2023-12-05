package weekThirteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        ArrayList<String> namesAL = new ArrayList<>();
        Random rand = new Random();

        int randNum = rand.nextInt(3);
        names.add("John");
        names.add("Lizzie");
        names.add(randNum, "Robin");
        System.out.println(names);
    }
}
