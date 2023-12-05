package weekEleven.bigOActivity;

public class BigO {
    //red = \u001B[31m
    //green = \u001B[32m
    //System.out.println("I am ready for Christmas!")
    public void printOnce(){
        System.out.println("\u001B[3m\u001B[32mI \u001B[31mam \u001B[32mready \u001B[31mfor \u001B[32mChristmas\u001B[31m!\u001B[0m");
    }
    public void printNTimes(int input){
        for(int i=0; i<input; i++) {
            if (i % 2 == 0) {
                System.out.println("\u001B[1m\u001B[36mI am ready for Christmas!\u001B[0m");
            }
            else{
                System.out.println("\u001B[1m\u001B[37mI am ready for Christmas!\u001B[0m");
            }
        }
    }
    public void printNSquaredTimes(int input){
        for(int i=0; i<input; i++){
            for(int j=0; j<input; j++){
                if((j+i)%2==0){
                    System.out.println("\u001B[1m\u001B[31mI \u001B[32mam \u001B[31mready \u001B[32mfor \u001B[31mChristmas\u001B[32m!\u001B[0m");
                }else{
                    System.out.println("\u001B[3m\u001B[32mI \u001B[31mam \u001B[32mready \u001B[31mfor \u001B[32mChristmas\u001B[31m!\u001B[0m");
                }
            }
        }
    }
}

