import java.util.Scanner;

public class PatternPrinting4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int blanks = 1; blanks <= rows - i; blanks++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
