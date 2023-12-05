package weekTen.ArrayListsAndJumps.CourseInfoActivity;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseInfo {
    Scanner console = new Scanner(System.in);
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<Double> GPA = new ArrayList<Double>();
    private ArrayList<Integer> scores = new ArrayList<Integer>();
    private ArrayList<Character> letterGrade = new ArrayList<Character>();

    public String nInput;
    public double gpaInput;
    public int sInput;
    public char lgInput;
    public void addToList(String nInput, double gpaInput, int sInput, char lgInput){
        name.add(nInput);
        GPA.add(gpaInput);
        scores.add(sInput);
        letterGrade.add(lgInput);
    }
    public void displayInfo(){
        System.out.printf("%-10s %-10s %-10s %s", "Name", "GPA", "Score", "Grade");
        for(int i=0;i<name.size(); i++){
            System.out.printf("%n%-10s %-10.1f %-10d %c", name.get(i), GPA.get(i), scores.get(i), letterGrade.get(i));
        }
    }

}
