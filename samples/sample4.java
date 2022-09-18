import java.util.Scanner;

public class sample4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        short num1 = inp.nextShort();

        System.out.print("Enter second number: ");
        short num2 = inp.nextShort();

        if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("The numbers are not equal!");
        }
    }
}