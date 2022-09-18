package countVowelsConsonantsSpecial;

public class countALLModified {
    public static void main(String[] args) {
        String x = "ANish' TapAS DUbeY";
        x = x.toUpperCase();
        char y[] = x.toCharArray();
        int size = y.length;
        
        int vowcnt = 0;
        int conscnt = 0;
        int splcnt = 0;

        int i = 0;

        while (i != size) {
            if (y[i] >= 'A' && y[i] <= 'Z') {
                if (y[i] == 'A' || y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] =='U') {
                    ++vowcnt;
                } else {
                    ++conscnt;
                }
            } else {
                ++splcnt;
            }
            ++i;
        }

        System.out.println(y);
        System.out.println("Vowels count: " + vowcnt);
        System.out.println("Consonent count: " + conscnt);
        System.out.println("Special Char count: " + splcnt);
    }
}
