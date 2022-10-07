import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //allows the scanner to be used
        DecimalFormat formatter = new DecimalFormat("#.##"); //allows the decimals to be correctly rounded

        System.out.println("Welcome to the Tip Calculator: ");

        System.out.print("How many people are in your group? ");
        int amountOfPeople = scan.nextInt();

        System.out.print("What is the tip percentage? (0-100) Please enter only the number. ");
        int taxRate = scan.nextInt(); //this will save the tax percentage

        TipCalculator calc1 = new TipCalculator(amountOfPeople, taxRate);

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (Type in -1 to end): ");
        double cost = scan.nextDouble();

        while(cost != -1) {
            calc1.addMeal(cost);
            System.out.print("Enter a cost in dollars and cents, e.g. 12,50 (Type -1 to end): ");
            cost = scan.nextDouble();
        }

        String formattedTotalBillBeforeTip = formatter.format(calc1.getTotalBillBeforeTip());
        String formattedTotalTip = formatter.format(calc1.tipAmount());
        String formattedTotalBillWithTip = formatter.format(calc1.totalBill());
        String formattedPerPersonBeforeTip = formatter.format(calc1.perPersonCostBeforeTip());
        String formattedTipPerPerson = formatter.format(calc1.perPersonTipAmount());
        String formattedTotalCostPer = formatter.format(calc1.perPersonTotalCost());





        System.out.println("----------------------");
        System.out.println("Total Bill before tip: " + formattedTotalBillBeforeTip);
        System.out.println("Tip Percentage: " + calc1.getTipPercentage());
        System.out.println("Total Tip: " + formattedTotalTip);
        System.out.println("Total Bill with Tip: " + formattedTotalBillWithTip);
        System.out.println("Per Person Cost Before Tip: " + formattedPerPersonBeforeTip);
        System.out.println("Tip Per Person: " + formattedTipPerPerson) ;
        System.out.println("Total Cost Per Person: " + formattedTotalCostPer);
    }
}


