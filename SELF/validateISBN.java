package SELF;

import java.util.Scanner;

public class validateISBN {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int isbn = 10;
        int s = 0, t = 0;

        int arrISBN[] = new int[10];

        int i = 1;
        while (i <= 10) {
            arrISBN[i - 1] = inp.nextInt();
            i++;
        }
        for (i = 0; i <= 10; i++) {
            t += arrISBN[i];
            s += t;
        }
        System.out.println(s % 11);
    }
}
