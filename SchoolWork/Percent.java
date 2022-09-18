package SchoolWork;

import java.util.Scanner;

public class Percent {
    short percent;

    void main() {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter you marks: ");
        percent = inp.nextShort();

        if (percent > 90) {
            System.out.println("Grade A");
        } else if (percent > 79 && percent < 90) {
            System.out.println("Grade B");
        } else if (percent > 59 && percent < 80) {
            System.out.println("Grade C");
        } else if (percent > 39 && percent < 60) {
            System.out.println("Grade D");
        } else if (percent < 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
