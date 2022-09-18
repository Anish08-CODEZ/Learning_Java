import java.util.*;

/* QUESTION
    If the marks of Robert in three subjects are entered through keyboard (each out of 100 ), write a program to calculate his total marks and percentage marks.
*/

public class practice4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = inp.nextLine();

        System.out.print("\n" + "Enter first subject's marks: ");
        double mark1 = inp.nextDouble();

        System.out.print("Enter second subject's marks: ");
        double mark2 = inp.nextDouble();

        System.out.print("Enter third subject's marks: ");
        double mark3 = inp.nextDouble();

        double sum = mark1 + mark2 + mark3;
        double percentage = (sum / 300) * 100;

        System.out.println("Hey, " + name + " your total marks are " + sum + " and in percent: " + percentage + "%");
    }
}
