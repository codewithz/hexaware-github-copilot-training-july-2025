import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.text.DecimalFormat;
 
public class BalanceAmount {
    // Account details
    private static final double INITIAL_DEPOSIT = 1000.00;
    private static final double ANNUAL_INTEREST_RATE = 2.01; // 2.01% per year
    private static final LocalDate ACCOUNT_OPENING_DATE = LocalDate.of(2024, 3, 16);
    public static void main(String[] args) {
        // Calculate balance for current date
        LocalDate currentDate = LocalDate.now();
        double currentBalance = calculateBalance(ACCOUNT_OPENING_DATE, currentDate);
        System.out.println("=== Savings Account Balance Calculator ===");
        System.out.println("Account opened: " + ACCOUNT_OPENING_DATE);
        System.out.println("Initial deposit: $" + formatCurrency(INITIAL_DEPOSIT));
        System.out.println("Annual interest rate: " + ANNUAL_INTEREST_RATE + "%");
        System.out.println("Interest compounded: Daily");
        System.out.println();
        System.out.println("Current date: " + currentDate);
        System.out.println("Days since account opening: " + ChronoUnit.DAYS.between(ACCOUNT_OPENING_DATE, currentDate));
        System.out.println("Current balance: $" + formatCurrency(currentBalance));
        // Calculate interest earned
        double interestEarned = currentBalance - INITIAL_DEPOSIT;
        System.out.println("Total interest earned: $" + formatCurrency(interestEarned));
        // Show some milestone balances
        System.out.println("\n=== Balance Milestones ===");
        showBalanceAt(LocalDate.of(2024, 12, 31), "End of 2024");
        showBalanceAt(LocalDate.of(2025, 3, 16), "1 Year Anniversary");
        showBalanceAt(LocalDate.of(2025, 6, 30), "Mid-2025");
    }
    /**
     * Calculate the account balance using daily compound interest formula
     * Formula: A = P(1 + r)^n
     * Where: P = principal, r = daily interest rate, n = number of days
     */
    public static double calculateBalance(LocalDate startDate, LocalDate endDate) {
        if (endDate.isBefore(startDate)) {
            return INITIAL_DEPOSIT; // No interest if end date is before start date
        }
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        // Convert annual rate to daily rate
        double dailyRate = (ANNUAL_INTEREST_RATE / 100.0) / 365.0;
        // Calculate compound interest: A = P(1 + r)^n
        double balance = INITIAL_DEPOSIT * Math.pow(1 + dailyRate, daysBetween);
        return balance;
    }
    /**
     * Helper method to show balance at a specific date
     */
    private static void showBalanceAt(LocalDate date, String description) {
        if (date.isAfter(ACCOUNT_OPENING_DATE)) {
            double balance = calculateBalance(ACCOUNT_OPENING_DATE, date);
            long days = ChronoUnit.DAYS.between(ACCOUNT_OPENING_DATE, date);
            System.out.println(description + " (" + date + "): $" + formatCurrency(balance) 
                             + " [" + days + " days]");
        }
    }
    // Static DecimalFormat instance for currency formatting
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#,##0.00");

    /**
     * Format currency to 2 decimal places
     */
    private static String formatCurrency(double amount) {
        return DECIMAL_FORMAT.format(amount);
    }
    /**
     * Calculate daily interest rate from annual rate
     */
    public static double getDailyInterestRate() {
        return (ANNUAL_INTEREST_RATE / 100.0) / 365.0;
    }
    /**
     * Calculate the effective annual rate with daily compounding
     */
    public static double getEffectiveAnnualRate() {
        double dailyRate = getDailyInterestRate();
        return (Math.pow(1 + dailyRate, 365) - 1) * 100;
    }
}
