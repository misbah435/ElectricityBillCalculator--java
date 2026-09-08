package electricitybill;

import java.util.Scanner;

public class ElectricityBillCalculator {

    // Method to calculate electricity bill
    public static double calculateBill(double units) {

        double bill;

        if (units <= 100) {
            bill = units * 5;
        } 
        else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } 
        else if (units <= 300) {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        } 
        else {
            bill = (100 * 5) + (100 * 7) + (100 * 10)
                    + ((units - 300) * 12);
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("       ELECTRICITY BILL CALCULATOR");
        System.out.println("==========================================");

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        // Validate units
        if (units < 0) {
            System.out.println();
            System.out.println("Error: Units cannot be negative.");
        } 
        else {
            double bill = calculateBill(units);

            System.out.println();
            System.out.println("------------ ELECTRICITY BILL ------------");
            System.out.println("Customer Name  : " + name);
            System.out.println("Units Consumed : " + units);
            System.out.println("Total Bill     : ₹" + String.format("%.2f", bill));
            System.out.println("------------------------------------------");
            System.out.println("        Thank you for using our service!");
            System.out.println("------------------------------------------");
        }

        sc.close();
    }
}