package basic;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);

        scanner.close();
    }

    /**
     * 문자열을 뒤집는 함수
     * 
     * @param str 뒤집을 문자열
     * @return 뒤집힌 문자열
     */
    public static String reverseString(String str) {
        // 방법 1: StringBuilder 사용
        return new StringBuilder(str).reverse().toString();
    }
}
