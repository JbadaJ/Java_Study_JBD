package basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series (Loop):");
            int sum = printFibonacciLoop(n);
            System.out.println("\nSum of Fibonacci Series: " + sum);
        }

        scanner.close();
    }

    // 반복문으로 피보나치 수열 생성 및 총합 계산
    public static int printFibonacciLoop(int n) {
        int a = 0, b = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
}
