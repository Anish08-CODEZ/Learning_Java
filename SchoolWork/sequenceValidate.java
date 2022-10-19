package SchoolWork;

import java.util.*;

public class sequenceValidate {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = inp.nextInt();
        int dis;

        int length = 0;
        int temp = 1;

        while (temp <= num) {
            length++;
            temp *= 10;
        }

        if (length == 4) {
            dis = num / 1000;
            System.out.println(dis);

            dis = num / 100;
            System.out.println(dis);

            dis = num / 10;
            System.out.println(dis);

            dis = num;
            System.out.println(dis);
        } else {
            System.out.println("The number of digits exeded or less then 4");
        }

        inp.close();
    }
}
