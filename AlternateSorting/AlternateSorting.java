import java.util.Scanner;

public class AlternateSorting {
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int a : arr) {
            System.out.print(a + " ,");
        }
        System.out.print("\b]");
    }

    public static int[] sortArray(int[] arr) {
        // Sort by descending first
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Alternate Sorting
        int k = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (i == j) {
                newArr[k] = arr[i];
                k++;
            } else {
                newArr[k] = arr[i];
                newArr[k + 1] = arr[j];
                k += 2;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Enter the size of array:");
        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nGiven Array:");
        printArray(arr);
        System.out.println("\n\nAlternate Sorted Array:");
        printArray(sortArray(arr));
        sc.close();
    }
}