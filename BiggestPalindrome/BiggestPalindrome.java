import java.util.Scanner;

public class BiggestPalindrome {
    static String sortAlphabetically(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);
    }

    static String getPalindrome(String str) {
        String start = "";
        char mid = ' ';
        String end = "";
        // check for unpaired chars and paired chars
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                i++;
                start += Character.toString(charArray[i]);
            } else {
                mid = charArray[i];
            }
        }
        StringBuilder reverse = new StringBuilder();
        reverse.append(start).reverse();
        end = new String(reverse);
        return start + Character.toString(mid) + end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        sc.close();
        str = sortAlphabetically(str.replace(" ", ""));
        String palindrome = getPalindrome(str);
        System.out.println("Max possible palindrome is : " + palindrome.length() + " characters");
        System.out.println("Ex : " + palindrome);

    }
}