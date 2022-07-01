public class CreditCalculator {

    private int amount;
    private int monthsNumber;
    private double percent;

    public CreditCalculator setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public CreditCalculator setMonthsNumber(int monthsNumber) {
        this.monthsNumber = monthsNumber;
        return this;
    }

    public CreditCalculator setPercent(double percent) {
        this.percent = percent;
        return this;
    }

    public double calculateMonthlyPayment() {
        return 0;
    }

    public double calculateRefundAmount() {
        return 0;
    }

    public double calculateOverpayment() {
        return 0;
    }
}
