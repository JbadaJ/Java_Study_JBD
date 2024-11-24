package basic;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산할 연산을 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.println("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("결과: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 연산자를 입력하셨습니다.");
        }

        scanner.close();
    }
}
