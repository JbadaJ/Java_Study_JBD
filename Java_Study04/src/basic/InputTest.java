package basic;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. 숫자만 입력");
            System.out.println("2. 문자도 입력 가능");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            String menuChoice = scanner.nextLine();

            if (menuChoice.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menuChoice) {
                case "1":
                    // 숫자만 입력
                    handleNumericInput(scanner);
                    break;
                case "2":
                    // 문자열 입력 (문자도 가능)
                    handleStringInput(scanner);
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 0, 1, 2 중에서 골라주세요.");
            }
        }

        scanner.close();
    }

    // 1번 기능: 숫자만 입력
    private static void handleNumericInput(Scanner scanner) {
        while (true) {
            System.out.print("숫자만 입력하세요: ");
            String input = scanner.nextLine();

            // 숫자만 들어있는지 정규식으로 확인
            if (input.matches("\\d+")) {
                // 유효한 숫자 입력
                System.out.println("입력하신 숫자: " + input);
                break;  // 정상 입력 후 해당 기능 종료
            } else {
                // 숫자가 아닌 문자가 포함됨
                System.out.println("잘못된 입력(숫자만 입력 가능). 다시 시도하시겠습니까?");
                System.out.print("(Y: 다시 시도, N: 취소): ");
                String retryChoice = scanner.nextLine().trim().toUpperCase();
                if (retryChoice.equals("N")) {
                    System.out.println("취소를 선택했습니다. 메인 메뉴로 돌아갑니다.");
                    break;  // 메인 메뉴로 돌아감
                } 
                // 그 외 (Y 등)는 반복 계속
            }
        }
    }

    // 2번 기능: 문자도 입력 가능
    private static void handleStringInput(Scanner scanner) {
        System.out.print("문자 입력(공백/숫자/문자 모두 가능): ");
        String input = scanner.nextLine();
        System.out.println("입력하신 문자열: " + input);
    }
}
