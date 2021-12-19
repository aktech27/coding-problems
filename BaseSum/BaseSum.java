import java.util.Scanner;

public class BaseSum {
    static int getSum(int num1, int num2, int base) {
        int size = (num1 > num2) ? Integer.toString(num1).length() : Integer.toString(num2).length();
        int[] digits = new int[size + 1];
        int digitsPointer = 0;
        int carry = 0;
        int sum = 0;
        while (num1 != 0 && num2 != 0) {
            int n1 = num1 % 10;
            int n2 = num2 % 10;
            digits[digitsPointer] = (n1 + n2 + carry) % base;
            digitsPointer++;
            carry = (int) ((n1 + n2 + carry) / base);
            num1 /= 10;
            num2 /= 10;
        }
        digits[digitsPointer] = carry;
        for (int i = 0; i <= size; i++) {
            sum += digits[i] * Math.pow(10, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Base of the numbers : ");
        int base = sc.nextInt();
        System.out.println("Sum of the numbers is " + getSum(num1, num2, base));
        sc.close();
    }
}
