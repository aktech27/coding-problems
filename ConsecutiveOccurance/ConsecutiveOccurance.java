import java.util.Scanner;

public class ConsecutiveOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        sc.close();
        char prev = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != prev) {
                prev = str.charAt(i);
                System.out.print(str.charAt(i));
            }
        }
    }
}
