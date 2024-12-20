package basic;

import java.util.Scanner;

public class TimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~60 사이의 숫자를 입력하세요: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        scanner.close();

        if (number < 1 || number > 60) {
            System.out.println("잘못된 범위의 숫자입니다. 프로그램을 종료합니다.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            System.out.println(i + "초");
            try {
                Thread.sleep(1000); // 1초(1000밀리초) 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("계산 완료!");
    }
}
