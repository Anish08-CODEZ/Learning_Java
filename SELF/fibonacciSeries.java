package SELF;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = 0, b = 1;

        System.out.print("Enter a number: ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int z = a + b;
            a = b;
            b = z;
        }

        inp.close();
    }
}
