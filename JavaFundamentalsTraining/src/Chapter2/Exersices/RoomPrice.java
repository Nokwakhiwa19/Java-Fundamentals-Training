package Chapter2.Exersices;

import java.util.Scanner;

public class RoomPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String bedChoice;
        int viewChoice;
        int price = 0;
        boolean validBed = false;
        boolean validView = false;

        // loop for Bed choice
        while (!validBed) {
            System.out.println("Please enter room choice:");
            System.out.println("A. Queen Bed ($125)");
            System.out.println("B. King Bed ($139)");
            System.out.println("C. King and Pullout couch ($165)");
            System.out.print("Enter your choice (A, B, or C): ");
            bedChoice = sc.next().toUpperCase();

            switch (bedChoice) {
                case "A":
                    price = 125;
                    validBed = true;
                    break;
                case "B":
                    price = 139;
                    validBed = true;
                    break;
                case "C":
                    price = 165;
                    validBed = true;
                    break;
                default:
                    System.out.println("Invalid bed choice. Please try again.\n");
            }
        }

        // View choice loop
        while (!validView) {
            System.out.println("Please choose a view:");
            System.out.println("1. Lake view (+$15)");
            System.out.println("2. Park view (+$0)");
            System.out.print("Enter your choice (1 or 2): ");

            if (sc.hasNextInt()) {
                viewChoice = sc.nextInt();
                if (viewChoice == 1) {
                    price += 15;
                    System.out.println("You selected lake view.");
                    validView = true;
                } else if (viewChoice == 2) {
                    System.out.println("You selected park view.");
                    validView = true;
                } else {
                    System.out.println("Invalid view choice. Please enter 1 or 2.\n");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1 or 2).\n");
                sc.next(); // consume invalid input
            }
        }

        // Final output after all valid input
        System.out.println("\nTotal room price: $" + price);
        sc.close();
    }
}
