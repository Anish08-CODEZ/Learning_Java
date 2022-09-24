public class Palindrome {
    public static void main(String[] args) {
        String x = "LIRIL";

        char y[] = x.toCharArray();
        int size = y.length;
        char a[] = new char[size];

        int i = 0;

        while (i != size) {
            a[size - 1 - i] = y[i];
            ++i;
        }

        i = 0;
        while (i != size) {
            if (a[i] != y[i]) {
                System.out.println("The string is not a PALINDROME!");
                System.exit(0);
            } else {
                ++i;
                continue;
            }
        }
        System.out.println("The string is a PALINDROME!");
    }
}
