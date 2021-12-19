import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArray {
    static int findMax(int[] subArray) {
        int maxNum = subArray[0];
        for (int num : subArray) {
            if (num > maxNum)
                maxNum = num;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for (int ptr = 0; ptr < arraySize; ptr++) {
            System.out.print("Enter the array element " + (ptr + 1) + " : ");
            array[ptr] = sc.nextInt();
        }
        System.out.println("\nGiven array is:");
        System.out.println(Arrays.toString(array));
        System.out.print("\nEnter the window size : ");
        int windowSize = sc.nextInt();
        sc.close();
        for (int i = 0; i <= array.length - windowSize; i++) {
            int subPtr = 0;
            int[] subArray = new int[windowSize];
            for (int j = i; j < i + windowSize; j++) {
                subArray[subPtr] = array[j];
                subPtr++;
            }
            System.out.print(findMax(subArray) + " ");
        }
    }
}
