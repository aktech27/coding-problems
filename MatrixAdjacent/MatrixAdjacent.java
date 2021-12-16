import java.util.Scanner;

public class MatrixAdjacent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required sum:");
        int sum = sc.nextInt();
        sc.close();
        int[][] matrix = {
                { 1, 3, 4, 6, 2 },
                { 3, 5, 8, 9, 0 },
                { 1, 7, 3, 2, 4 },
                { 2, 3, 1, 4, 2 },
                { 6, 4, 3, 2, 1 }
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k <= 1; k++) {
                    for (int l = 0; l <= 1; l++) {
                        if (k == 0 && l == 0)
                            continue;
                        if (i + k >= 0 && j + l >= 0 && i + k < matrix.length && j + l < matrix.length) {
                            if (matrix[i][j] + matrix[i + k][j + l] == sum) {
                                System.out.println(matrix[i][j] + " + " + matrix[i + k][j + l] + " : " + sum);
                            }
                        }
                    }
                }
            }
        }
    }
}
