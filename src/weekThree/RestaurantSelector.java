package weekThree;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Is anyone in your party a vegetarian?");
        String veg = console.nextLine().toLowerCase();
        System.out.println("Is anyone in your party a vegan?");
        String vega = console.nextLine().toLowerCase();
        System.out.println("Is anyone in your party a gluten-free?");
        String gf = console.nextLine().toLowerCase();

        boolean veg1 = (veg.equals("yes"))? true: false;
        boolean vega1 = (vega.equals("yes"))? true: false;
        boolean gf1 = (gf.equals("yes"))? true: false;

        System.out.println("Here are your restaurant choices:");
        if (veg1)
            if(vega1)
                System.out.println("\tCorner Cafe\n\tThe Chef's Kitchen");
            else
                if(gf1)
                    System.out.println("\tMain Street Pizza Company\n\tCorner Cafe\n\tThe Chef's Kitchen");
                else
                    System.out.println("\tMama's Fine Italian\n\tMain Street Pizza Company\n\tCorner Cafe\n\tThe Chef's Kitchen");
        else
            if(vega1)
                System.out.println("\tCorner Cafe\n\tThe Chef's Kitchen");
            else
                if(gf1)
                    System.out.println("\tMain Street Pizza Company\n\tCorner Cafe\n\tThe Chef's Kitchen");
                else
                    System.out.println("\tJoe's Gourmet Burgers\n\tMama's Fine Italian\n\tMain Street Pizza Company\n\tCorner Cafe\n\tThe Chef's Kitchen");




    }
}
