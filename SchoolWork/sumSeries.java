package SchoolWork;

import java.util.Scanner;

public class sumSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        double sum = 0;

        System.out.print("Enter a number: ");
        int n = inp.nextInt();

        for (double i = 1; i <= n; i++) {
            double a = 1 / i;
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
