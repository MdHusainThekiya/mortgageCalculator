package MortgageCalculator.Version3;

public class Main {
    final static byte MONTHS_IN_A_YEAR = 12;
    final static byte PERCENTAGE = 100;

    public static void main(String[] args){
        int principal = (int)Console.readNumber("principal", 1000, 1000000000, "Rs");
        float annualInterestRate = (float)Console.readNumber("annualInterestRate", 1, 30, "%");
        int timeInYears = (int)Console.readNumber("timeInYears", 1, 30, "Year");

        var calculator = MortgageCalculator.calculateMortgage(principal, annualInterestRate, timeInYears);
        var report = new MortageReport(calculator);

    }

}
