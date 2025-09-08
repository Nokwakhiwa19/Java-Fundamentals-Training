package Chapter1.Exercise;

import javax.swing.*;
import java.util.Scanner;

public class SocialClub {
    public static void main(String[] args) {
        // Prices
        final double ADULT_PRICE = 50.00;
        final double CHILD_PRICE = 37.50;

        // Input: number of adult meals
        int adultMeals = Integer.parseInt(
                JOptionPane.showInputDialog("Enter the number of adult meals:"));

        // Input: number of child meals
        int childMeals = Integer.parseInt(
                JOptionPane.showInputDialog("Enter the number of child meals:"));

        // Calculations
        double adultTotal = adultMeals * ADULT_PRICE;
        double childTotal = childMeals * CHILD_PRICE;
        double grandTotal = adultTotal + childTotal;

        // Display results
        String message = "Fundraiser Totals:\n"
                + "Adult meals (" + adultMeals + "): R" + adultTotal + "\n"
                + "Child meals (" + childMeals + "): R" + childTotal + "\n"
                + "-----------------------------------\n"
                + "Grand Total: R" + grandTotal;

        JOptionPane.showMessageDialog(null, message);

    }
}
