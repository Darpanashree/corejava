package assignment2;

import java.util.Scanner;

public class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter address: ");
        address = scanner.nextLine();

        System.out.print("Enter phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter sales amount: ");
        salesAmount = scanner.nextDouble();
    }

    // Method to calculate the commission
    public void calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }

        System.out.println("The commission for sales amount " + salesAmount + " is: " + commission);
    }

    public static void main(String[] args) {
        // Create a Commission object
        Commission commission = new Commission();

        // Accept details and calculate commission
        commission.acceptDetails();
        commission.calculateCommission();
    }
}
