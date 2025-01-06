package Coffee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.makeMenu(); // 메뉴 초기화

        while (true) {
            System.out.println("\n=== 커피 주문 시스템 ===");
            System.out.println("1. 새로운 주문 시작");
            System.out.println("0. 프로그램 종료");
            System.out.print("번호를 선택하세요: ");

            int mainChoice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            if (mainChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (mainChoice) {
                case 1:
                    // 메뉴 보여주기
                    menu.showMenu();

                    // 주문(커피 선택) 및 총합 계산
                    int totalPrice = menu.cash(scanner);
                    
                    // 영수증 생성
                    // 예: "Order_" + System.currentTimeMillis() 같은 식으로 고유 이름 생성 가능
                    Receipt receipt = new Receipt("NewOrder", totalPrice);

                    // 결제 금액 및 영수증 출력
                    System.out.println("총 결제 금액: " + totalPrice + "원");
                    System.out.println("영수증: " + receipt.getName() + " - " + receipt.getPrice());
                    
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }

        scanner.close();
    }
}
