package weekThirteen.HashMap;

import weekThirteen.HashMap.HashMapActivity;

public class hashMapTest {
    public static void main(String[] args) {

        //HashMap<typeValue, typeKey> hashMapName = new HashMap<>();


        // cars.remove("LaFerrari");
        // System.out.println("New HashMap: "+cars);
        HashMapActivity cars = new HashMapActivity();
        cars.Add("Corvette", "Chevrolet");
        cars.Add("Supra", "Toyota");
        cars.Add("Chiron", "Bugatti");
        cars.Add("LaFerrari", "Ferrari");
        System.out.println("\nOriginal Hashmap: "+cars.Display());
        cars.Remove("LaFerrari");
        System.out.println("New Hashmap: "+cars.Display());
        //System.out.println("Value from key: "+cars.Get("Supra"));
        cars.Get("Corvette");
    }
}
