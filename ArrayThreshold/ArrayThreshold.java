import java.util.Scanner;

public class ArrayThreshold {
    static int getCount(int num, int threshold) {
        int count;
        count = (num / threshold);
        if (num % threshold != 0)
            count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element number " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the threshold : ");
        int threshold = sc.nextInt();
        sc.close();
        int count = 0;
        for (int num : arr) {
            count += getCount(num, threshold);
        }
        System.out.print("Count = " + count);
    }
}