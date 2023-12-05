package weekTen.ArrayListsAndJumps.StringArrayListActivity;

import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String> courseName = new ArrayList<String>();
    private ArrayList<Double> GPA = new ArrayList<Double>();
    private ArrayList<Integer> scores = new ArrayList<Integer>();
    private ArrayList<Character> letterGrade = new ArrayList<Character>();

    public void addScore(int score){
        scores.add(score);
    }
    public void removeScore(int score){
        scores.remove(score);
    }
    public int getScore(int index){
        return scores.get(index);
    }
    public int getScoreListSize(){
        return scores.size();
    }
    public void displayScores1(){
        System.out.println("Scores:");
        for (Object score : scores){
            System.out.println(score);
        }
    }
    public void displayScores2(){
        System.out.println("Scores:");
        for(int i=0; i < scores.size(); i++){
            System.out.println(scores.get(i));
        }
    }
}
