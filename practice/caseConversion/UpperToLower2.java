package caseConversion;

public class UpperToLower2 {
    public static void main(String[] args) {
        String x = "ANISH TAPAS DUBEY";
        char y[] = x.toCharArray();
        int size = y.length;
        
        int i = 1;
        while (i != size) {
            if (y[i] == ' ') {
                y[i+1] = (char) (y[i+1] - 32);
            } else {
                y[i] = (char) (y[i] + 32);
            }
            ++i;
        }

        System.out.println(x);
        System.out.println(y);
    }
}
