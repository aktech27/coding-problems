import java.util.Scanner;
import java.util.Arrays;

public class SumofString {
    public static String printExpression(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String S = "";
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] != ch[j]) {
                    break;
                } else {
                    count++;
                    i++;
                }
            }
            if (i == ch.length - 1) {
                S += Integer.toString(count) + "*" + Integer.toString((int) ch[i] - 96) + " = ";
            } else {
                S += Integer.toString(count) + "*" + Integer.toString((int) ch[i] - 96) + " + ";
            }
        }
        return new String(S);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int sum = 0;
        System.out.print("Enter a string:");
        str = sc.next();
        sc.close();
        for (char ch : str.toCharArray()) {
            sum += (int) ch - 96;
        }
        System.out.println("Sum of the string is:" + sum);
        // This is optional not asked in question, but given in explanation
        System.out.println("(" + printExpression(str) + Integer.toString(sum) + ")");
    }
}