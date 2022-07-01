import java.math.BigDecimal;
import java.math.RoundingMode;

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
        double m = percent / 12 / 100;double scale = Math.pow(10, 3);
        double ratio = (m * Math.pow((1 + m), monthsNumber) / (Math.pow((1 + m), monthsNumber) - 1));
        BigDecimal ratioResult = new BigDecimal(ratio);
        ratioResult = ratioResult.setScale(3, RoundingMode.DOWN);
        return amount * ratioResult.doubleValue();
    }

    public double calculateRefundAmount() {
        return calculateMonthlyPayment() * monthsNumber;
    }

    public double calculateOverpayment() {
        return calculateRefundAmount() - amount;
    }
}
