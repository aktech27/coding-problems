import java.util.Scanner;

public class SubArray {
    static boolean isValid(int[] subArray, int fav) {
        String allNums = "";
        for (int num : subArray) {
            allNums += Integer.toString(num);
        }
        for (int i = 0; i < allNums.length(); i++) {
            if (Character.getNumericValue(allNums.charAt(i)) == fav)
                return true;
        }
        return false;
    }

    static int findMax(int[] subArray) {
        int[] maxNumArr = new int[4];
        int maxNum = 0;
        for (int num : subArray) {
            StringBuilder sb = new StringBuilder(Integer.toString(num));
            sb.reverse();
            String Num = new String(sb);
            for (int i = 0; i < Num.length(); i++) {
                if (Character.getNumericValue(Num.charAt(i)) > maxNumArr[i]) {
                    maxNumArr[i] = Character.getNumericValue(Num.charAt(i));
                }
            }
        }
        for (int j = 0; j < maxNumArr.length; j++) {
            maxNum += maxNumArr[j] * Math.pow(10, j);
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the window size:");
        int windowSize = sc.nextInt();
        System.out.print("Enter the favourite number:");
        int favouriteNum = sc.nextInt();
        int[][] validArr = new int[10][10];
        int validArrPtr = 0;
        int[][] invalidArr = new int[10][10];
        int invalidArrPtr = 0;
        sc.close();
        int[] arr = { 35, 145, 67, 1004, 88, 456, 2034 };
        for (int i = 0; i <= arr.length - windowSize; i++) {
            System.out.print("{");
            int subPtr = 0;
            int[] subArray = new int[windowSize];
            for (int j = i; j < i + windowSize; j++) {
                subArray[subPtr] = arr[j];
                subPtr++;
                System.out.print(arr[j] + ",");
            }
            if (isValid(subArray, favouriteNum)) {
                validArr[validArrPtr] = subArray;
                validArrPtr++;
            } else {
                invalidArr[invalidArrPtr] = subArray;
                invalidArrPtr++;
            }
            System.out.print("\b} : " + findMax(subArray) + "\n");
        }
        System.out.print("\n\nArrays ");
        for (int r = 0; r < validArrPtr; r++) {
            System.out.print("{");
            for (int c = 0; c < windowSize; c++) {
                System.out.print(validArr[r][c] + ",");
            }
            System.out.print("\b}, ");
        }
        System.out.println("\b\b are valid arrays");
        System.out.print("Arrays ");
        for (int r = 0; r < invalidArrPtr; r++) {
            System.out.print("{");
            for (int c = 0; c < windowSize; c++) {
                System.out.print(invalidArr[r][c] + ",");
            }
            System.out.print("\b}, ");
        }
        System.out.print("\b\b are invalid arrays\n");
    }
}
