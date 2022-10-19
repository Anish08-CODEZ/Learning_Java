package SELF.StarPatterns;

public class fifthPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) { // loop for rows
            for (int j = 5; j >= i; j--) { // loop for spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // loop for columns
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 6; i++) { // loop for rows
            for (int j = 1; j <= i; j++) { // loop for spaces
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) { // loop for columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
