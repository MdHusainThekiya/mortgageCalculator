package MortgageCalculator.Version3;

import java.util.Scanner;

public class Console {
    public static double readNumber(String prompt, int min, int max, String unit){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print("Please enter the " + prompt + " (" + min + " " + unit + " to " + max + " " + unit + "): ");
            value = scanner.nextDouble();
            if (value < min || value > max) {
                System.out.println("Invalid Input");
            } else
                break;
        }
        return value;
    }

}
