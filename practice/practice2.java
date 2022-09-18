import java.util.Scanner;

/* QUESTION
    Take 3 inputs from user and check :
    all are equal
    any of two are equal
    ( use && || ) 
*/

public class practice2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your FIRST number: ");
        int num1 = inp.nextInt();

        System.out.print("Enter your SECOND number: ");
        int num2 = inp.nextInt();

        System.out.print("Enter your THIRD number: ");
        int num3 = inp.nextInt();
        
        System.out.println("All are equal: " + (num1==num2 && num2==num3 && num3==num1));
        System.out.println("Any two numbers are equal: " + (num1==num2 || num2==num3 || num3==num1));

        inp.close();
    }
}
