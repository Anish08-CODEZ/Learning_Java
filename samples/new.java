import java.util.*;

class new5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item1 = "Vada pav";
        String item2 = "bhajia pav";
        String item3 = "Samosa";
        String item4 = "Lasagna";
        String item5 = "Manchurian pav";
        String item6 = "Pizza";
        String abc = "Ye lo ";
        
        System.out.println("Enter your order: ");
        String order = scan.nextLine();
        
        if (order == item1) {
            System.out.println(abc + item1);
        } else if (order == item2) {
            System.out.println(abc + item2);
        } else if (order == item3) {
            System.out.println(abc + item3);
        } else if (order == item4) {
            System.out.println(abc + item4);
        } else if (order == item5) {
            System.out.println(abc + item5);
        } else if (order == item6) {
            System.out.println(abc + item6);
        }
    }
}