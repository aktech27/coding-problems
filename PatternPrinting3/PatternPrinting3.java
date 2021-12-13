import java.util.Scanner;

public class PatternPrinting3 {
    public static void main(String[] args) {
        int num;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        num = sc.nextInt();
        System.out.print("Enter the character to print:");
        str = sc.next();
        sc.close();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == i || j == num - i - 1)
                    System.out.print(str);
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
