package SchoolWork;

import java.util.*;

public class integerToString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        int amt = inp.nextInt();

        String amtStr = Integer.toString(amt);
        System.out.println("Number converted to string: " + "\"" + amtStr + "\"");

        inp.close();
    }
}