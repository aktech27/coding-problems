import java.util.Scanner;

public class NumberSequence {
    static int eval(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '^') {
                int num1 = Integer.parseInt(exp.substring(0, i));
                int endPos = exp.indexOf("^", i + 1);
                if (endPos == -1)
                    endPos = exp.length();
                int num2 = Integer.parseInt(exp.substring(i + 1, endPos));
                int pow = (int) Math.pow(num1, num2);
                exp = exp.replace(exp.substring(0, endPos), Integer.toString(pow));
                i = 0; // since exp length has changed, reset the loop

            }
            if (exp.charAt(i) == '*') {
                int num1 = Integer.parseInt(exp.substring(0, i));
                int endPos = exp.indexOf("*", i + 1);
                if (endPos == -1)
                    endPos = exp.length();
                int num2 = Integer.parseInt(exp.substring(i + 1, endPos));
                int mul = (int) num1 * num2;
                exp = exp.replace(exp.substring(0, endPos), Integer.toString(mul));
                i = 0;

            }

        }
        return Integer.parseInt(exp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of series : ");
        int n = sc.nextInt();
        String[] expressions = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter expression " + (i + 1) + " : ");
            expressions[i] = sc.next();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (eval(expressions[i]) > eval(expressions[j])) {
                    String temp = expressions[i];
                    expressions[i] = expressions[j];
                    expressions[j] = temp;
                }
            }
        }
        System.out.println("\n\nSorted List:");
        for (String exp : expressions) {
            System.out.println(exp);
        }
    }
}
