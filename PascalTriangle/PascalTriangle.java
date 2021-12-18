import java.util.Scanner;

public class PascalTriangle {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);

    }

    static int nCr(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        for (int i = 0; i <= rows; i++) {
            for (int blanks = 1; blanks <= rows - i; blanks++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
