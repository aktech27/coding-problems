import java.util.Scanner;

public class StringLenDecode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        sc.close();
        int arr[] = new int[26]; // to store repetation of 26 alphabets
        for (int i = 0; i < str.length(); i++) {
            char[] chArr = str.toCharArray();
            int ptr = i;
            if (Character.isAlphabetic(chArr[i])) {
                ptr++;
                String count = "";
                while (!(Character.isAlphabetic(chArr[ptr]))) {
                    count += chArr[ptr];
                    ptr++;
                    if (ptr == str.length())
                        break;
                }
                arr[(int) (chArr[i]) - 97] = Integer.parseInt(count);
            }
        }
        for (int j = 0; j < 26; j++) {
            for (int c = 1; c <= arr[j]; c++) {
                System.out.print((char) (j + 97));
            }
        }

    }
}
