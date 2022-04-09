package MortgageCalculator.Version3;

public class MortgageCalculator {
    public static double calculateMortgage(int principal, float annualInterestRate, int timeInYears){
        // Formula to calculate mortgage
        int timeInMonths = timeInYears * Main.MONTHS_IN_A_YEAR;
        float monthlyInterestRate = annualInterestRate / (Main.PERCENTAGE * Main.MONTHS_IN_A_YEAR);
        return (principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, timeInMonths))
                / (Math.pow(1 + monthlyInterestRate, timeInMonths) - 1));
    }
}
