package SchoolWork;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        short standardCharge = 250;

        System.out.print("Please enter your name: ");
        String name = inp.next();

        System.out.print("Enter units consumed: ");
        double units = inp.nextDouble();

        System.out.println("\n" + "The name of cutomer: " + name);
        System.out.println("Number of units consumed: " + units);

        double bill;
        if (units < 100) {
            bill = 1 * units + standardCharge;
            System.out.println("The total bill is: " + bill);
        } else if (units >= 100 && units <= 200) {
            bill = 1 * 99 + (units - 99) * 2 + standardCharge;
            System.out.println("The total bill is: " + bill);
        } else if (units > 200) {
            bill = 1 * 99 + 2 * (200-99) + (units - 200) * 3 + standardCharge;
            System.out.println("The total bill is: " + bill);
        }
    }
}
