package weekSix.classActivity;

public class Characters {
    private String name,color,moveName;
    private int hitPoint;
    int point;

    Characters(){
        this.color = "red";
        this.hitPoint = 20;

    }
    Characters(String name, String color, String moveName, int hitPoint){
        this.name = name;
        this.color = color;
        this.moveName = moveName;
        this.hitPoint = hitPoint;

    }
    //Setters and getters
    //Setters - Mutators
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMoveName(String moveName){
        this.moveName = moveName;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public String getMoveName(){
        return moveName;
    }
    public int getHitPoint(){
        return hitPoint;
    }
    //display information
    public void displayInfo(){
        System.out.printf("This is the name of your character: %s%n", this.name);
        System.out.printf("This is the move name of your character: %s%n", this.moveName);
        System.out.printf("This is the hit points of your character: %d%n", this.hitPoint);
    }

}
