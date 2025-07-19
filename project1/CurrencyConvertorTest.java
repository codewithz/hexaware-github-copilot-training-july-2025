import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConvertorTest {

    @Test
    void testConvertUsdToInr_withPositiveAmount() {
        CurrencyConvertor converter = new CurrencyConvertor();
        double usdAmount = 100.0;
        double expectedInr = 8300.0;
        double actualInr = converter.convertUsdToInr(usdAmount);
        assertEquals(expectedInr, actualInr, 0.0001);
    }

    @Test
    void testConvertUsdToInr_withZeroAmount() {
        CurrencyConvertor converter = new CurrencyConvertor();
        double usdAmount = 0.0;
        double expectedInr = 0.0;
        double actualInr = converter.convertUsdToInr(usdAmount);
        assertEquals(expectedInr, actualInr, 0.0001);
    }

    @Test
    void testConvertUsdToInr_withNegativeAmount() {
        CurrencyConvertor converter = new CurrencyConvertor();
        double usdAmount = -50.0;
        double expectedInr = -4150.0;
        double actualInr = converter.convertUsdToInr(usdAmount);
        assertEquals(expectedInr, actualInr, 0.0001);
    }
}