package weekThirteen.HashMap;

import java.util.HashMap;

public class HashMapActivity {
    HashMap<String, String> cars = new HashMap<>();
    /*cars.put("Corvette", "Chevrolet");
        cars.Add("Supra", "Toyota");
        cars.Add("Chiron", "Bugatti");
        cars.Add("LaFerrari", "Ferrari");*/
    public void Add(String typeValue, String typeKey){
        cars.put(typeValue, typeKey);
    }
    public void Remove(String typeValue){
        cars.remove(typeValue);
    }
    public HashMap Display(){
        //System.out.println(cars);
        return cars;
    }
    public void Get(String typeValue){
        Object car;
        if(cars.containsKey(typeValue)){
            car = cars.get(typeValue);
        }else{
            car = "Not found";
        }
        System.out.println("Value from key '"+typeValue+"': "+car);
        //return car;
    }
}
