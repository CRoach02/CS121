package weekNine;

public class Car {

    // instance variables/Fields
    //attributes
    private String make, model;
    private int year, price;

    private static int instanceCount = 0;

    public Car(){

    }
    public  Car(String make, String model, int year, int price){
        //Initialize instance variables
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

        //increment static variables
        instanceCount ++;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void showDetails(){
        System.out.println("The care you entered is a "+make+" "+model+" from "+year+" with the price of $"+price+".");
    }
    public static int getInstanceCount(){
        return instanceCount;
    }
}
