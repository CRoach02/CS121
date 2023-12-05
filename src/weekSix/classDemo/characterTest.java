package weekSix.classDemo;

public class characterTest {
    public static void main(String[] args) {
        //Scanner instance
        //Scanner keyboard = new Scanner(System.in);
        //keyboard.nextLine();
        //create an instance
        characters BlazeOne = new characters();
        characters Squirtle = new characters("Squirtle", "blue", "Water Cannon", 50);

        BlazeOne.setName("Yveltal");
        BlazeOne.setColor("Red");
        BlazeOne.setHitPoint(60);
        BlazeOne.setMoveName("Phantom Force");

        //System.out.println(BlazeOne.color);
        //System.out.println(BlazeOne.name);
        //System.out.println(BlazeOne.hitPoint);
        Squirtle.displayInfo();


    }
}
