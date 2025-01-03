package Coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
    // 메뉴에 있는 Coffee 객체들을 담을 리스트 (필드로 선언)
    private List<Coffee> coffeeList;

    // 생성자에서 리스트 초기화
    public Menu() {
        coffeeList = new ArrayList<>();
    }

    // 커피 메뉴 생성 (초기 세팅)
    public void makeMenu() {
        coffeeList.add(new Coffee("Americano", 4000));
        coffeeList.add(new Coffee("Latte", 4500));
        coffeeList.add(new Coffee("Espresso", 3500));
        coffeeList.add(new Coffee("Cappuccino", 5000));
    }

    // 메뉴 출력
    public void showMenu() {
        System.out.println("=== Coffee Menu ===");
        for (int i = 0; i < coffeeList.size(); i++) {
            Coffee coffee = coffeeList.get(i);
            // 번호를 함께 표시 (i+1)
            System.out.println((i + 1) + ". " + coffee.getName() + " : " + coffee.getPrice() + "원");
        }
        System.out.println("===================");
    }

    // 사용자로부터 커피 선택을 받아 총 결제 금액을 계산하는 메서드
    public int cash(Scanner scanner) {
        int total = 0;

        while (true) {
            System.out.print("메뉴 번호를 선택하세요 (0 입력 시 선택 종료): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                // 0이면 메뉴 선택을 끝냄
                break;
            }

            // 범위 밖 선택 시 안내
            if (choice < 1 || choice > coffeeList.size()) {
                System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            } else {
                Coffee selected = coffeeList.get(choice - 1);
                total += selected.getPrice();
                System.out.println("[" + selected.getName() + "] 선택! 현재 합계: " + total + "원");
            }
        }

        return total;
    }
}
