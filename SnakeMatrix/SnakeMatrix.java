public class SnakeMatrix {
    static void printSnakePattern(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            // even rows print left to right or vice versa
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };
        printSnakePattern(matrix);
        System.out.println();

        // also works for non-square matrix(3x5)
        int[][] matrix1 = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 }
        };
        printSnakePattern(matrix1);
        System.out.println();

        // also works for any 2D array
        int[][] matrix2 = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8 },
                { 9, 10, 11, 12, 13, 14 },
                { 15, 16 }
        };
        printSnakePattern(matrix2);
        System.out.println();

    }
}
