package SchoolWork;

public class fibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int x;

        for (x = 1; x <= 20; ++x) {
            System.out.print(a + ", ");
            int z = a + b;
            a = b;
            b = z;
        }
    }
}
