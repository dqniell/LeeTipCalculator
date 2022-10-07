public class TipCalculator {

    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;



    public TipCalculator(int amountOfPeople, int tipPercentage) {
        numPeople = amountOfPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;

    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
       // return cost;
    }

    public double tipAmount() {
        return totalBillBeforeTip * tipPercentage;
    }

    public double totalBill() {
        return tipAmount() + totalBillBeforeTip;
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        return (totalBill() / numPeople);
    }
}