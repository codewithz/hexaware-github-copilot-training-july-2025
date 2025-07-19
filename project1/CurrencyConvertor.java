
public class CurrencyConvertor {
    private static final double USD_TO_INR_RATE = 83.0; // Example rate

    public double convertUsdToInr(double usdAmount) {
        return usdAmount * USD_TO_INR_RATE;
    }

    public static void main(String[] args) {
        CurrencyConvertor converter = new CurrencyConvertor();
        double usd = 100;
        double inr = converter.convertUsdToInr(usd);
        System.out.println(usd + " USD = " + inr + " INR");
    }
}
