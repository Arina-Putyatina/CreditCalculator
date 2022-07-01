public class Main {

    public static void main(String[] args) {
        CreditCalculator calculator = new CreditCalculator()
                .setAmount(100000)
                .setMonthsNumber(24)
                .setPercent(20);

        System.out.println("Кредит 100000 на 24 месяца под 20% годовых");
        System.out.println("Ежемесячный платеж = " + calculator.calculateMonthlyPayment());
        System.out.println("Общая сумма возврата = " + calculator.calculateRefundAmount());
        System.out.println("Сумма переплаты = " + calculator.calculateOverpayment());
    }
}
