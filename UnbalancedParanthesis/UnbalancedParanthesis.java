import java.util.Scanner;

public class UnbalancedParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ptr = 0;
        int opened = 0, closed = 0;
        char toRemove = '-';
        char toMatch = '-';
        System.out.print("Enter the expression: ");
        String str = sc.next();
        sc.close();
        char[] index = new char[str.length()];
        // count the opened and closed
        for (int i = 0; i < str.length(); i++) {
            if (str.toCharArray()[i] == '(')
                opened++;
            if (str.toCharArray()[i] == ')')
                closed++;
        }
        if (opened > closed) {
            toRemove = '(';
            toMatch = ')';
        }

        if (closed > opened) {
            toRemove = ')';
            toMatch = '(';
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.toCharArray()[j] == toRemove) {
                // note all index of toRemove as char
                index[ptr] = Integer.toString(j).toCharArray()[0];
                ptr++;
            }
            if (str.toCharArray()[j] == toMatch) {
                // if match is found remove that index
                ptr--;
                index[ptr] = '\0';
            }

        }
        StringBuilder newStr = new StringBuilder(str);
        System.out.println(newStr);
        for (char x : index) {
            int xx = Character.getNumericValue(x);
            if (xx >= 0)
                newStr.deleteCharAt(xx);
        }
        System.out.println(newStr);
    }
}