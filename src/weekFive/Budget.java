package weekFive;

import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        //Partner: Brayden Saunders

        Scanner console = new Scanner(System.in);

        double total = 0;
        int expNum = 1;

        System.out.println("Enter the amount budgeted for a month");
        double budget = console.nextDouble();

        System.out.println("Enter the amount of your first expense: ");
        double input = console.nextDouble();

        while(input > 0){
            total += input;
            expNum++;
            System.out.print("Enter the amount for expense "+expNum+", or enter '0' to stop the budget: ");
            input = console.nextDouble();
        }

        if(total > budget) {
            System.out.printf("Budget: $%.2f\nExpenses: $%.2f\nYou are over budget by: $%.2f", budget, total, (total - budget));
        }
        else{
            System.out.printf("Budget: $%.2f\nExpenses: $%.2f\nYou are under budget by: $%.2f", budget, total, (budget - total));


        }
    }
}
