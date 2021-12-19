import java.util.Scanner;

public class NumToWords {
    static String toWords(int number) {
        String[] unitPlace = { "", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen" };

        String[] tensPlace = { "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };

        if (number < 20) {
            return unitPlace[number];
        } else if (number < 99) {
            int tens = number / 10;
            int units = number % 10;
            return tensPlace[tens - 2] + " " + unitPlace[units];
        }
        int hundreds = number / 100;
        int tens = number % 100;
        if (tens == 0)
            return unitPlace[hundreds] + " hundred only";
        return unitPlace[hundreds] + " hundred and " + toWords(tens);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        sc.close();
        System.out.println(toWords(number));

    }
}
