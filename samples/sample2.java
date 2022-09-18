import java.util.Scanner;
class Ans{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    double x = s.nextDouble();
    double y = s.nextDouble();
    double area = x*y;
    System.out.println((int)area);
  }
}