public class reverseString {
    public static void main(String[] args) {
        String x = "Anish Dubey";

        char y[] = x.toCharArray();
        int size = y.length;
        char a[] = new char[size];

        int i = 0;
        while (i != size) {
            a[size - 1 - i] = y[i];
            ++i;
        }
        System.out.println(y);
        System.out.println(a);
    }
}
