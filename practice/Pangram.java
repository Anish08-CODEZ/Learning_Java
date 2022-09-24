public class Pangram {
    public static void main(String[] args) {
        // String x = "THE QUICK broWn FOX JUMPS OveR A LAZY DOG";
        String x = "He is ANISH";
        x = x.toUpperCase();
        x = x.replace(" ", "");
        char y[] = x.toCharArray();
        int size = y.length;
        char a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int i = 0;
        while (i != size) {
            int index = y[i] - 65;
            a[index] = 1;
            ++i;
        }

        i = 0;
        while (i != 26) {
            if (a[i] == 1) {
                ++i;
            } else {
                System.out.println("Non-Pangram!");
                System.exit(0);
            }
        }
        System.out.println("PANGRAM!");
    }
}
