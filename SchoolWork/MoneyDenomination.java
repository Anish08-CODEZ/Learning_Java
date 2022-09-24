package SchoolWork;

import java.util.*;

public class MoneyDenomination {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int ogAmt, amt, a2000, a500, a200, a100, a50, a20, a10, a5, a2, a1;

        System.out.print("Enter an AMOUNT: ");
        ogAmt = inp.nextInt();

        amt = ogAmt;

        a2000 = amt / 2000;
        amt = amt % 2000;

        a500 = amt / 500;
        amt = amt % 500;

        a200 = amt / 200;
        amt = amt % 200;

        a100 = amt / 100;
        amt = amt % 100;

        a50 = amt / 50;
        amt = amt % 50;

        a20 = amt / 20;
        amt = amt % 20;

        a10 = amt / 10;
        amt = amt % 10;

        a5 = amt / 5;
        amt = amt % 5;

        a2 = amt / 2;
        amt = amt % 2;

        a1 = amt;
        amt = 0;

        int total2000 = a2000 * 2000;
        int total500 = a500 * 500;
        int total200 = a200 * 200;
        int total100 = a100 * 100;
        int total50 = a50 * 50;
        int total20 = a20 * 20;
        int total10 = a10 * 10;
        int total5 = a5 * 5;
        int total2 = a2 * 2;
        int total1 = a1;

        System.out.println("\n" + "The money DENOMINATION for " + ogAmt + " is:");
        System.out.println("FORMAT of denomination: (Rupees x Count of Note) = Product of both");
        System.out.println("\n" + "2000 x " + a2000 + " = " + total2000);
        System.out.println("500 x " + a500 + " = " + total500);
        System.out.println("200 x " + a200 + " = " + total200);
        System.out.println("100 x " + a100 + " = " + total100);
        System.out.println("50 x " + a50 + " = " + total50);
        System.out.println("20 x " + a20 + " = " + total20);
        System.out.println("10 x " + a10 + " = " + total10);
        System.out.println("5 x " + a5 + " = " + total5);
        System.out.println("2 x " + a2 + " = " + total2);
        System.out.println("1 x " + a1 + " = " + total1);
    }
}
