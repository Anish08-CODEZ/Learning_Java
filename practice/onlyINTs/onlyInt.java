package onlyINTs;

public class onlyInt {
    public static void main(String[] args) {
        String x = "97ABC";
        char y[] = x.toCharArray();
        int size = y.length;

        int i = 0;
        while (i != size) {
            if (y[i] >= '0' && y[i] <= '9') {
                ++i;
            } else {
                System.out.println("Not an Interger string!");
                System.exit(0);
            }
        }
        System.out.println("Interger String!");
    }
}
