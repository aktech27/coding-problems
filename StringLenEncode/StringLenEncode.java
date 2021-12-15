import java.util.Scanner;

public class StringLenEncode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.next();
        sc.close();
        int[] arr = new int[26]; // to store iteration count of 26 alphabets
        for (char alphabet : str.toCharArray()) {
            arr[(int) (alphabet) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                char ch = (char) (i + 97);
                System.out.print(ch);
                System.out.print(arr[i]);
            }
        }
    }
}
