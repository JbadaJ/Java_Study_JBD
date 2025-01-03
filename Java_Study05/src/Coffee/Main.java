package Coffee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        menu.makeMenu();     // 메뉴 초기화
        menu.showMenu();     // 메뉴 출력

        int totalPrice = menu.cash(scanner); // 커피 주문 및 총합 계산
        System.out.println("총 결제 금액: " + totalPrice + "원");

        scanner.close();
    }
}
