package weekTen.ArrayListsAndJumps.CourseInfoActivity;

import weekTen.ArrayListsAndJumps.StringArrayListActivity.StringArrayList;

import java.util.Scanner;

public class CourseInfoTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StringArrayList cInfo = new StringArrayList();
        CourseInfo x = new CourseInfo();
        while(true){
            String a, name;
            int score;
            double gpa;
            char lGrade;
            System.out.println("Enter the name of the course or type 'q' to quit");
            a = console.nextLine().toUpperCase();
            if(a.equalsIgnoreCase("q")){
                break;
            }else{
                name = a;
            }
            System.out.println("Enter the GPA for the course or type 'q' to quit");
            a = console.nextLine();
            if(a.equalsIgnoreCase("q")){
                break;
            }else{
                gpa = Double.parseDouble(a);
            }
            System.out.println("Enter the score for the course or type 'q' to quit");
            a = console.nextLine();
            if(a.equalsIgnoreCase("q")){
                break;
            }else{
                score = Integer.parseInt(a);
            }
            System.out.println("Enter the letter grade for the course or type 'q' to quit");
            a = console.nextLine().toUpperCase();
            if(a.equalsIgnoreCase("q")){
                break;
            }else{
                lGrade = a.charAt(0);
            }
            x.addToList(name, gpa, score, lGrade);
        }
        x.displayInfo();
    }
}
