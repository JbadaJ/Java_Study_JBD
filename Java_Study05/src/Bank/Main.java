package Bank;

import java.util.Scanner;

import Bank.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        // 저축계좌: 계좌번호 "S001", 초기잔액 1000원, 이자율 2%
        SavingAccount sAcc = new SavingAccount("S001", 1000, 0.02);
        manager.addAccount(sAcc);

        // 당좌계좌: 계좌번호 "C001", 초기잔액 500원, 오버드래프트 한도 300원
        CheckingAccount cAcc = new CheckingAccount("C001", 500, 300);
        manager.addAccount(cAcc);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 메인 메뉴 ===");
            System.out.println("1. SavingAccount 기능");
            System.out.println("2. CheckingAccount 기능");
            System.out.println("3. 전체 계좌 출력");
            System.out.println("0. 종료");
            System.out.print("번호를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    savingMenu(sAcc, scanner);
                    break;
                case 2:
                    checkingMenu(cAcc, scanner);
                    break;
                case 3:
                    manager.printAllAccounts();
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }

        scanner.close();
    }

    // 저축계좌 관련 메뉴
    public static void savingMenu(SavingAccount sAcc, Scanner scanner) {
        while (true) {
            System.out.println("\n=== SavingAccount 메뉴 ===");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 이자 추가");
            System.out.println("4. 계좌 정보 출력");
            System.out.println("0. 상위 메뉴로");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break; // 상위 메뉴로 돌아가기
            }

            switch (choice) {
                case 1:
                    System.out.print("입금할 금액: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    sAcc.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("출금할 금액: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    sAcc.withdraw(withdrawAmount);
                    break;
                case 3:
                    sAcc.addInterest();
                    break;
                case 4:
                    sAcc.printInfo();
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    // 당좌계좌 관련 메뉴
    public static void checkingMenu(CheckingAccount cAcc, Scanner scanner) {
        while (true) {
            System.out.println("\n=== CheckingAccount 메뉴 ===");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 계좌 정보 출력");
            System.out.println("0. 상위 메뉴로");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break; // 상위 메뉴로 돌아가기
            }

            switch (choice) {
                case 1:
                    System.out.print("입금할 금액: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    cAcc.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("출금할 금액: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    cAcc.withdraw(withdrawAmount);
                    break;
                case 3:
                    cAcc.printInfo();
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
