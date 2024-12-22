package basic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        // 오늘 날짜 구하기
        LocalDate today = LocalDate.now();
        
        // 날짜를 보기 좋게 포맷팅 (예: 2023-08-20 형식)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // 오늘 날짜 출력
        System.out.println("오늘 날짜: " + today.format(formatter));
        
        // 사용자로부터 n일을 입력받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("며칠 후 날짜를 알고 싶나요? 일 수를 입력하세요: ");
        int days = scanner.nextInt();
        scanner.close();
        
        // n일 후 날짜 계산
        LocalDate futureDate = today.plusDays(days);
        
        // 결과 출력
        System.out.println(days + "일이 지난 날짜: " + futureDate.format(formatter));
    }
}
