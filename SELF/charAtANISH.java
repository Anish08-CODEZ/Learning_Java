package SELF;

import java.util.*;

public class charAtANISH {
    public char charAtOwn(String str, int index) {
        char[] y = str.toCharArray();
        char atPOS = y[index];
        System.out.println("The character at the given position is: " + atPOS);
        return atPOS;
    }

    public static void main(String[] args) {
        charAtANISH obj = new charAtANISH();
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a STRING: ");
        String strMain = inp.nextLine();

        System.out.println("Enter an INDEX to know the character at that position: ");
        short ind = inp.nextShort();

        obj.charAtOwn(strMain, ind);
    }
}
