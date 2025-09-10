package Chapter3.Exercise3;

import java.util.Scanner;

public class RetirementGoal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearsUntilRetirement = 0;
        double annualSavings = 0.0;

        // Prompt for years until retirement
        while (yearsUntilRetirement <= 0) {
            System.out.print("Enter the number of years until retirement: ");
            if (scanner.hasNextInt()) {
                yearsUntilRetirement = scanner.nextInt();
                if (yearsUntilRetirement <= 0) {
                    System.out.println("Please enter a positive number of years.");
                }
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next();
            }
        }

        // Prompt for annual savings
        while (annualSavings <= 0) {
            System.out.print("Enter the amount you can save annually: ");
            if (scanner.hasNextDouble()) {
                annualSavings = scanner.nextDouble();
                if (annualSavings <= 0) {
                    System.out.println("Please enter a positive amount.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
        }

        // Calculate total savings (no interest)
        double totalSavings = 0.0;
        double currentAnnualSavings = annualSavings;

        System.out.println("\nSavings per year:");
        for (int year = 1; year <= yearsUntilRetirement; year++) {
            System.out.printf("Year %d: R%.2f%n", year, currentAnnualSavings);
            totalSavings += currentAnnualSavings;
            currentAnnualSavings *= 1.10; // increase by 10% for next year
        }


        // Display result
        System.out.printf("You will have R%.2f saved at retirement.%n", totalSavings);

        scanner.close();
    }
}

