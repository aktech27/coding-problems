import java.util.Scanner;

public class NumberOfPaths {
    static int noOfPaths(int rows, int cols) {
        if (rows == 1 || cols == 1)
            return 1;
        return noOfPaths(rows - 1, cols) + noOfPaths(rows, cols - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns:");
        int cols = sc.nextInt();
        sc.close();
        System.out.println("Number of Possible Paths: " + noOfPaths(rows, cols));
    }
}
