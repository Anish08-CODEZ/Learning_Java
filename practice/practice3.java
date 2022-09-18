import java.util.*;

/* QUESTION
    Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check 
    if both the conditions 'a < 50' and 'a < b' are true. 
*/

public class practice3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter FIRST number: ");
        int a = inp.nextInt();

        System.out.print("Enter your SECOND number: ");
        int b = inp.nextInt();

        if (a < 50 && a < b) {
            System.out.println("Both conditions MATCHED!");
        } else if (a < 50 || a < b) {
            System.out.println("ONLY one condition MATCHED!");
        } else {
            System.out.println("NONE of the condition matched!");
        }

        inp.close();
    }
}
