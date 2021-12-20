import java.util.Scanner;

public class CyclicNumber {
    static String leftShift(String num) {
        char[] numArr = num.toCharArray();
        char temp = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            numArr[i - 1] = numArr[i];
        }
        numArr[numArr.length - 1] = temp;
        return new String(numArr);
    }

    static String isCyclic(int num1, int num2) {
        if (num1 == num2) {
            return "Yes";
        }
        String n1 = Integer.toString(num1);
        String n2 = Integer.toString(num2);
        // A n-digit number can be shifted left/right (n-1) times
        // From nth time it repeats itself
        for (int count = 1; count < n1.length(); count++) {
            n2 = leftShift(n2);
            if (n1.equals(n2)) {
                return "Yes";
            }
        }

        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println(isCyclic(num1, num2));
        sc.close();
    }
}
