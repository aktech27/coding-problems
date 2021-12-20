import java.util.Scanner;

public class ValidExpressions {
    static String isValid(String expression) {
        // brackets
        int paranthesis = 0, square = 0, curly = 0; // increment for every opening and decrement for every close,
                                                    // inorder to find unbalanced brackets
        int flag = 0;
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '(':
                    paranthesis++;
                    break;
                case ')':
                    paranthesis--;
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    int n1 = (int) expression.charAt(i - 1);
                    int n2 = (int) expression.charAt(i + 1);
                    if (!(n1 >= 97 && n1 <= 122 && n2 >= 97 && n2 <= 122))
                        flag++; // n1,n2 can be a to z
                    break;
            }
        }
        if (paranthesis != 0 || square != 0 || curly != 0 || flag != 0)
            return "INVALID";
        return "VALID";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression : ");
        String expression = sc.next();
        System.out.println(isValid(expression));
        sc.close();
    }
}
