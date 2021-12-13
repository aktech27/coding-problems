import java.util.Scanner;

public class PatternPrinting2 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == i || j == num - i - 1)
                    System.out.print(j + 1);
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}