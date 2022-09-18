import java.util.*;

public class sample {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        // System.out.print("Enter 1st number: ");
        // double num1 = scan.nextDouble();

        // System.out.print("Enter 2nd number: ");
        // double num2 = scan.nextDouble();

        // System.out.print("Enter 3rd number: ");
        // double num3 = scan.nextDouble();

        // double sum = num1 + num2 + num3;
        // double average = sum / 3;

        // System.out.println("The average of three numbers is: " + average);

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int length_Name = name.length() - 1;
        char dot = '.';

        for (int i = 0; i <= length_Name; i++) {
            char c = name.charAt(i);
            if (c == dot) {
                System.out.println(name.charAt(i+1));
            }
        }

        scan.close();
    }
}