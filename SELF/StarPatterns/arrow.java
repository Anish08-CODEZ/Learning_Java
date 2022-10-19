package SELF.StarPatterns;

public class arrow {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) { // loop for rows
            for (int j = 1; j <= i; j++) { // loop for columns
                System.out.print("* ");
            }
            System.out.println(); // for leaving a line
        }
        for (int i = 1; i <= 6; i++) { // loop for rows
            for (int j = 5; j >= i; j--) { // loop for columns
                System.out.print("* ");
            }
            System.out.println(); // for leaving a line
        }
    }
}
