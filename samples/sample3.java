import java.util.*;

public class sample3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your Roll No.: ");
        int rollNo = scan.nextInt();

        scan.nextLine();
        System.out.print("Enter your Field of Interest: ");
        String c = scan.nextLine();

        System.out.println("Enter you phone number: ");
        int ph = scan.nextInt();

        System.out.println("Enter your Gender: ");
        String gen = scan.nextLine();

        // System.out.println("Hello, my name is: " + name + ", and my Roll No. is: " + rollNo + ", and my Field of Interest is: " + c);
        System.out.println("Hello, my name is: " + name + ", and my Roll No. is: " + rollNo + ", and my Field of Interest is: " + c + "safiajf: " + ph+ " Gender is: " + gen);
    }
}