package Coffee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 커피 리스트 생성
        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("Americano", 4000));
        coffeeList.add(new Coffee("Latte", 4500));
        coffeeList.add(new Coffee("Espresso", 3500));
        coffeeList.add(new Coffee("Cappuccino", 5000));

        // 메뉴판 출력
        System.out.println("=== Coffee Menu ===");
        for (Coffee coffee : coffeeList) {
            System.out.println(coffee.getName() + " : " + coffee.getPrice() + "원");
        }
    }
}