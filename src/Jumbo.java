import java.util.Scanner;

import java.text.DecimalFormat;

public class Jumbo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //allows the scanner to be used
        DecimalFormat formatter = new DecimalFormat("#.##"); //allows the decimals to be correctly rounded

        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are in your group? ");
        int amountOfPeople = scan.nextInt(); //this will save the integer for the amount of people
        scan.nextLine();

        System.out.print("What is the tip percentage? (0-100) Please enter only the number. ");
        int taxRate = scan.nextInt(); //this will save the tax percentage
        scan.nextLine();

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (Type in -1 to end): ");
        double cost = scan.nextDouble(); //this will differ per user input, as used later in while loop.

        double totalCost = cost; //first sets the total cost to be equal to the first input of cost

        //while loop
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents. Type in -1 to end. ");
            cost = scan.nextDouble(); //saves the input as a double
            if(cost != -1) { //to negate the -1 that is inputted
                totalCost += cost; //this is how the total cost will be updated.
            }
        }

        totalCost = totalCost; //declares variable for the format
        String formattedTotalCost = formatter.format(totalCost);

        double totalTip = (taxRate * 0.01) * totalCost; //turns the integer inputted for the tax percentage into an integer, and multiplies it to find the total tip
        String formattedTotalTip = formatter.format(totalTip);

        double tipAndCost = totalTip + totalCost; //saves double
        String formattedTipAndCost = formatter.format(tipAndCost);

        double perPersonNoTip = totalCost / amountOfPeople; //solves for the cost per person before tip
        String formattedPerPersonNoTip = formatter.format(perPersonNoTip);

        double tipPer = totalTip / amountOfPeople; //calculates tip per person
        String formattedTipPer = formatter.format(tipPer);

        double totalPerPerson = tipAndCost / amountOfPeople; //calcs the total each person needs to pay
        String formattedTotalPerPerson = formatter.format(totalPerPerson);

        //print statements
        System.out.println("----------------");
        System.out.println("Total bill before tip: " + formattedTotalCost);
        System.out.println("Tax Percentage: " + taxRate);
        System.out.println("Total Tip: " + formattedTotalTip);
        System.out.println("Total bill with tip: " + formattedTipAndCost);
        System.out.println("Per Person Cost Before Tip: " + formattedPerPersonNoTip);
        System.out.println("Tip Per Person: " + formattedTipPer);
        System.out.println("Total Cost Per Person: " + formattedTotalPerPerson);
        System.out.println("----------------");

        System.out.println("Thank you for using the tip calculator!");
        scan.close();

    }
}
