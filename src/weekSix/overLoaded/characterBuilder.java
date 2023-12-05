package weekSix.overLoaded;

public class characterBuilder {
    public String name, move;
    private int hitPoints, movePwr, atkSpeed;

    characterBuilder(){
    }
    characterBuilder(String name){
        this.name = name;
    }

    characterBuilder(String name, String move, int hitPoints, int movePwr, int atkSpeed){
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
    //Hit-points decrease from attack
    public void setHitPoints(int hitPoints, int movePwr) {
        if (hitPoints - movePwr <= 0) {
            this.hitPoints = 0;
        } else {
        this.hitPoints = hitPoints - movePwr;
        }
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
    public void displayCharacter(){
        System.out.printf("Character name: %s%n", name);
        System.out.printf("Character move name: %s%n", move);
        System.out.printf("Character hit points: %d%n", hitPoints);
        System.out.printf("Character move power: %d%n", movePwr);
        System.out.printf("Character attack speed: %d%n", atkSpeed);
    }

    public void printTest(){
        System.out.println(hitPoints);
    }
}
