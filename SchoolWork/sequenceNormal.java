package SchoolWork;

import java.util.*;

public class sequenceNormal {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = inp.nextInt();
        int dis;

        dis = num / 1000;
        System.out.println(dis);

        dis = num / 100;
        System.out.println(dis);

        dis = num / 10;
        System.out.println(dis);

        dis = num;
        System.out.println(dis);

        inp.close();
    }
}