import java.util.Scanner;

import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many people are in your group? ");
        int amountOfPeople = scan.nextInt();

        System.out.print("What is the tip percentage? Please enter only the number. ");
        int taxRate = scan.nextInt();

        System.out.print("Enter a cost in dollars and cents. Type in -1 to end. ");
        double cost = scan.nextDouble();

        double totalCost = cost;

        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents. Type in -1 to end. ");
            cost = scan.nextDouble();
            totalCost += cost;
        }

        double totalTip = (taxRate * 0.01) * totalCost;
        String formattedTotalTip = formatter.format(totalTip);

        double tipAndCost = totalTip + totalCost;
        String formattedTipAndCost = formatter.format(tipAndCost);

        double perPersonNoTip = totalCost / amountOfPeople;
        String formattedperPersonNoTIp = formatter.format(perPersonNoTip);

        double tipPer = totalTip / amountOfPeople;
        String formattedtipPer = formatter.format(tipPer);


        double totalPerPerson = tipAndCost / amountOfPeople;
        String formattedtotalPerPerson = formatter.format(totalPerPerson);


        System.out.println("----------------");

        System.out.println("Total bill before tip: " + totalCost);
        System.out.println("Tax Percentage: " + taxRate);
        System.out.println("Total Tip: " + totalTip);
        System.out.println("Total bill with tip: " + tipAndCost);
        System.out.println("Per Person Cost Before Tip: " + perPersonNoTip);
        System.out.println("Tip Per Person: " + tipPer);
        System.out.println("Total Cost Per Person: " + totalPerPerson);



    }
}
