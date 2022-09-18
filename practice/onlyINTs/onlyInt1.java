package onlyINTs;

public class onlyInt1 {
    public static void main(String[] args) {
        String x = "97ABC";
        int size = x.length();

        int i = 0;
        while (i != size) {
            if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
                ++i;
            } else {
                System.out.println("Not an Interger string!");
                System.exit(0);
            }
        }
        System.out.println("Integer String!");
    }
}
