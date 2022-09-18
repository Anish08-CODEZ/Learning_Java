import java.util.Scanner;

/* QUESTION
    Take two different string input and print them in same line. E.g.-
    INPUT : Codes
    Dope
    OUTPUT : CodesDope
*/

public class practice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter you first word: ");
        String firstWord = inp.next();

        System.out.print("Enter you second word: ");
        String secondWord = inp.next();
        
        System.out.println("COMBINATION of word is: " + firstWord + secondWord);
        inp.close();
    }
}
