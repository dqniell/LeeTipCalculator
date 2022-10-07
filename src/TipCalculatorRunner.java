import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //allows the scanner to be used

        System.out.println("Welcome to the Tip Calculator: ");

        System.out.println("How many people are in your group? ");
        int amountOfPeople = scan.nextInt();

        System.out.print("What is the tip percentage? (0-100) Please enter only the number. ");
        int taxRate = scan.nextInt(); //this will save the tax percentage

        TipCalculator calc1 = new TipCalculator(amountOfPeople, taxRate);

        System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (Type in -1 to end): ");
        int cost = scan.nextInt();

        while(cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (Type in -1 to end): ");
            double cost1 = scan.nextDouble(); //this will differ per user input, as used later in while loop.
            calc1.addMeal(cost1);
            if(cost == -1) { //to negate the -1 that is inputted
                System.out.println("Total Bill before tip: " );
                System.out.println("Tip Percentage");
                System.out.println("Total Tip: ");
                System.out.println("Total Bill with Tip: ");
                System.out.println("Per Person Cost Before Tip: ");
                System.out.println("Tip Per Person: ");
                System.out.println("Total Cost Per Person: ");






            }
    }
}

}
