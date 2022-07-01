import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    CreditCalculator sut;

    @BeforeEach
    public void init() {
        sut = new CreditCalculator()
                .setAmount(100000)
                .setMonthsNumber(24)
                .setPercent(20);
    }

    @Test
    void calculateMonthlyPayment_success() {

        double expected = 5000;
        double result = sut.calculateMonthlyPayment();

        assertEquals(expected, result);
    }

    @Test
    void calculateRefundAmount_success() {

        double expected = 120000;
        double result = sut.calculateRefundAmount();

        assertEquals(expected, result);
    }

    @Test
    void calculateOverpayment_success() {

        double expected = 20000;
        double result = sut.calculateOverpayment();

        assertEquals(expected, result);

    }
}
