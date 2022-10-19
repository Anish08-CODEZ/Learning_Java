package SELF;

public class LCM {
  public static void main(String[] args) {

    int n1 = 153, n2 = 1, lcm;

    // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, lcm);
        break;
      }
      ++lcm;
    }
  }
}