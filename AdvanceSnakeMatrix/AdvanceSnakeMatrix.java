import java.util.Scanner;

public class AdvanceSnakeMatrix {
    static int[][] shiftColumns(int[][] matrix, int colStart) {
        // shift the columns of matrix,one by one, colStart times
        for (int count = 1; count <= colStart; count++) {
            // left shift the column values row by row
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][0];
                for (int j = 1; j < matrix[i].length; j++) {
                    matrix[i][j - 1] = matrix[i][j];
                }
                matrix[i][matrix[i].length - 1] = temp;
            }
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix, int rowStart) {
        int flag = 0;
        if (rowStart == 0)
            flag = 1; // to print top to bottom

        for (int j = 0; j < matrix.length; j++) {
            // if flag =0, print bottom to top
            // if flag =1, print top to bottom
            if (j % 2 == flag) {
                for (int i = 4; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int i = 0; i < matrix[j].length; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 5, 6, 15, 16, 25 },
                { 4, 7, 14, 17, 24 },
                { 3, 8, 13, 18, 23 },
                { 2, 9, 12, 19, 22 },
                { 1, 10, 11, 20, 21 }
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the starting row:");
        int rowStart = sc.nextInt();
        System.out.print("\nEnter the starting column:");
        int colStart = sc.nextInt();
        sc.close();
        matrix = shiftColumns(matrix, colStart);
        printMatrix(matrix, rowStart);
    }
}
