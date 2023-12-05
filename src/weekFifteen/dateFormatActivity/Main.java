package weekFifteen.dateFormatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        TotalCalories calTest = new TotalCalories();
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the number of calories consumed per day: ");
        double calorieRate = console.nextDouble();
        console.nextLine();
        System.out.println("Enter the date the diet will begin in the format MM/DD/YYYY: ");
        String date1 = console.nextLine();
        System.out.println("Enter the date the diet will end in the format MM/DD/YYYY: ");
        String date2 = console.nextLine();
        double totalCals = calTest.calcTotalCalories(calorieRate, date1, date2);
        System.out.println("Total calories consumed over "+calTest.days+" days: "+totalCals);
    }
}
