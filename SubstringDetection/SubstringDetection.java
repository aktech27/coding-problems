import java.util.Scanner;

public class SubstringDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.print("Enter the substring : ");
        String substr = sc.next();
        char[] subarr = substr.toCharArray();
        int substrPointer = 0;
        int flag = -1;
        sc.close();
        int windowSize = substr.length(); // useful for grouping characters from str based on substr length
        // looping through every group and match char by char
        for (int window = 0; window < str.length() - windowSize; window++) {
            substrPointer = 0;
            for (int i = window; i < window + windowSize; i++) {
                if (str.charAt(i) == subarr[substrPointer]) { // character matches, check next char
                    substrPointer++;
                    flag = window;
                } else {// character does not match, go for next sequence
                    substrPointer = 0;
                    flag = -1;
                    break;
                }
            }
            if (flag != -1) { // substring found exit loop
                break;
            }
        }
        System.out.println(flag);
    }
}
