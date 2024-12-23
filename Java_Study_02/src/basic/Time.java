package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Time{
    public static void main(String[] args) {
        // 현재 시각 구하기
        LocalDateTime now = LocalDateTime.now();
        // 시각 포맷 지정 (연-월-일 시:분:초)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 현재 시각 출력
        System.out.println("현재 시각: " + now.format(formatter));

        Scanner scanner = new Scanner(System.in);

        // 사용자에게 초를 더할지, 분을 더할지 선택
        System.out.println("어떤 단위를 더하시겠습니까?");
        System.out.println("1. 초 더하기");
        System.out.println("2. 분 더하기");
        System.out.print("선택: ");
        int choice = scanner.nextInt();

        // 사용자에게 더할 양 입력받기
        System.out.print("더할 양을 입력하세요: ");
        int amount = scanner.nextInt();
        scanner.close();

        LocalDateTime futureTime = now; // 결과를 담을 변수

        // 선택에 따라 시간을 더함
        switch (choice) {
            case 1:
                // 초 더하기
                futureTime = now.plusSeconds(amount);
                break;
            case 2:
                // 분 더하기
                futureTime = now.plusMinutes(amount);
                break;
            default:
                System.out.println("잘못된 선택입니다. 프로그램을 종료합니다.");
                return; // 메인 메서드 종료
        }

        // 결과 출력
        System.out.println("현재 시각: " + now.format(formatter));
        System.out.println(amount + ((choice == 1) ? "초" : "분") + " 후 시각: " + futureTime.format(formatter));
    }
}
