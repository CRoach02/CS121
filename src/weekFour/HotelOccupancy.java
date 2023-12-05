package weekFour;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int rooms = 0;
        int occupancy = 0;

        System.out.println("Enter the number of floors.");
        int floors = console.nextInt();

        for(int i = 1; i <= floors; i++){
            System.out.println("Enter the number of rooms on floor "+i);
            rooms += console.nextInt();
            System.out.println("How many of the floor's rooms are occupied?");
            occupancy += console.nextInt();
        }
        double occupancyR = (double)occupancy/(double)rooms;
        int oPer = (int)(occupancyR*100);
        int vacant = rooms - occupancy;
        System.out.println("\nFloors: "+floors+"\nRooms: "+rooms+"\nOccupied Rooms: "+occupancy+"\nVacant Rooms: "+vacant+"\nOccupancy: "+occupancyR+" ("+oPer+"%)");


    }
}
