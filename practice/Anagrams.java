import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = inp.nextLine();

        System.out.print("Enter second string: ");
        String secondString = inp.nextLine();

        firstString = firstString.replace(" ", "");
        secondString = secondString.replace(" ", "");

        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        char x[] = firstString.toCharArray();
        char y[] = secondString.toCharArray();
        
        Arrays.sort(x);
        Arrays.sort(y);

        boolean result = Arrays.equals(x, y);

        if (result == true) {
            System.out.println("The string are ANAGRAMS");
        } else {
            System.out.println("The strings are NON-ANAGRAMS");
        }
    }
}
