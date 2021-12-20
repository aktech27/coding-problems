import java.util.Scanner;

public class StringPairMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1 = sc.next();
        System.out.print("Enter the second string : ");
        String str2 = sc.next();
        sc.close();
        if (str1.equals(str2)) {
            System.out.println("No mismatches.");
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    System.out.print(str1.charAt(i) + "," + str2.charAt(i) + "  ");
                }
            }
        }
    }
}
