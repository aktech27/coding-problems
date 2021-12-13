import java.util.Scanner;

public class PatternPrinting1 {
    public static void main(String[] args) {
        String str;
        System.out.print("Enter the string:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (j == i || j == str.length() - 1 - i)
                    System.out.print(str.toCharArray()[j]);
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
