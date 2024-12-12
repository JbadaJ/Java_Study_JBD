package basic;

import java.util.Scanner;

public class TwoBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        
        // 정수를 이진수 문자열로 변환
        String binaryString = Integer.toBinaryString(number);
        
        System.out.println("2진수 표현: " + binaryString);
        
        scanner.close();
    }
}
