package basic;

import java.util.Scanner;

public class Calculate2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산할 연산을 입력하세요 Ver.1.2 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.println("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        // 계산 함수 호출
        double result = calculate(num1, num2, operator);

        // 결과 출력
        if (!Double.isNaN(result)) {
            System.out.println("결과: " + result);
        }

        scanner.close();
    }

    /**
     * 두 숫자와 연산자를 받아 계산 결과를 반환하는 함수
     * @param num1 첫 번째 숫자
     * @param num2 두 번째 숫자
     * @param operator 연산자 (+, -, *, /)
     * @return 계산 결과 (잘못된 연산자는 NaN 반환)
     */
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return Double.NaN; // NaN (Not a Number) 반환
                }
            default:
                System.out.println("잘못된 연산자를 입력하셨습니다.");
                return Double.NaN;
        }
    }
}
