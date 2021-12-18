import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum >= 10)
            return sumOfDigits(sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(sumOfDigits(num));
    }

}
