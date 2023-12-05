package weekSix.encapsulationPractice;

public class charInfo {
    public String name, move;
    private int hitPoints, movePwr, atkSpeed;

    charInfo(String name, String move, int hitPoints, int movePwr, int atkSpeed){
        this.name = name;
        this.move = move;
        this.hitPoints = hitPoints;
        this.movePwr = movePwr;
        this.atkSpeed = atkSpeed;
    }
    //Set
    public void setName(String name){
        this.name = name;
    }
    public void setMove(String move){
        this.move = move;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public void setMovePwr(int movePwr){
        this.movePwr = movePwr;
    }
    public void setAtkSpeed(int atkSpeed){
        this.atkSpeed = atkSpeed;
    }
    //get
    public String getName(){
        return name;
    }
    public String getMove(){
        return move;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public int getMovePwr(){
        return movePwr;
    }
    public int getAtkSpeed(){
        return atkSpeed;
    }
    public void displayCharInfo(){
        System.out.printf("Character name: %s%n", this.name);
        System.out.printf("Character move name: %s%n", this.move);
        System.out.printf("Character hit points: %d%n", this.hitPoints);
        System.out.printf("Character move power: %d%n", this.movePwr);
        System.out.printf("Character attack speed: %d%n", this.atkSpeed);
    }
}
