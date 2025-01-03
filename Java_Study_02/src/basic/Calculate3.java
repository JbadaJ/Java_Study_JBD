package basic;

import java.util.Scanner;

public class Calculate3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose Function \n1. Simple Arithmetic\n2. Square Root\n3. Log Function\nEnter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // 남아있는 줄바꿈 문자 제거

        if (choice == 1) {
            simpleArithmetic(scanner); // 사칙연산 함수 호출
        } else if (choice == 2) {
            squareRoot(scanner); // 루트 계산 함수 호출
        } else if (choice ==3) {
        	log(scanner);
        }
        else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }

        scanner.close();
    }

    // 간단한 사칙연산 함수
    public static void simpleArithmetic(Scanner scanner) {
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        scanner.nextLine(); // 남아있는 줄바꿈 문자 제거
        double num2 = scanner.nextDouble();
        scanner.nextLine(); // 남아있는 줄바꿈 문자 제거

        System.out.println("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);
    }

    // 루트 계산 함수
    public static void squareRoot(Scanner scanner) {
        System.out.println("Enter a number to find its square root:");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Square root of negative numbers is not supported in real numbers!");
        } else {
            double result = Math.sqrt(num);
            System.out.println("Square root of " + num + " is: " + result);
        }
    }
    public static void log(Scanner scanner) {
    	System.out.print("1.Log \n2.Common Log\nEnter Number:");
    	double num1 = scanner.nextDouble();
    	scanner.nextLine();
    	System.out.print("Enter Number: ");
    	double num2 = scanner.nextDouble();
    	scanner.nextLine();
    	
    	if (num1 == 1) {
    		System.out.println(Math.log(num2));
    	}else if (num1 == 2) {
    		System.out.println(Math.log10(num2));
    	}else {
    		System.out.println("You Input Wrong Number");
    	}
    }
}
//계산결과가 float로 출력되는건 아직 수정할 필요는 없어 보임.
//다른 수학식들도 추가시킬 필요
//사칙연산이나 제곱근계산도 그냥 계산기 처럼 개선할 필요
//여유되면 선형대수학 및 확률변수론 문제들도 구현해보기