package weekSix.classActivity;

public class Cars {
    public String name;
    public int mpg, year;

    Cars(String name, int year, int mpg){
        this.name = name;
        this.mpg = mpg;
        this.year = year;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMpg(int mpg){
        this.mpg = mpg;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void displayInfo() {
        System.out.printf("This is the name of your car: %s%n", this.name);
        System.out.printf("This is the year of your car: %s%n", this.year);
        System.out.printf("This is the miles per gallon (mpg) of your car: %d%n", this.mpg);
    }
}
