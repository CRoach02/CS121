package weekTen.RecursionActivity;

public class Recursion {
    public String countDown(int num){
        if(num==0){
            return "Blast Off!";
        }
        else{
            System.out.print(num+"...");
            return countDown(num-1);
        }
    }
    public char alphaBackwards(char character){
        if(character == 'a'){
            return 'a';
        }else{
            System.out.print(character+" ");
            return alphaBackwards((char)(character-1));
        }
    }
}
