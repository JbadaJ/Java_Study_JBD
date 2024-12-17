package book2;

import java.util.Scanner;

import book2.Book;
import book2.Manager;
import book2.EBook;
import book2.PaperBook;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        while (true) {
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. EBook 기능");
            System.out.println("2. PaperBook 기능");
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
                    ebookMenu(manager, scanner);
                    break;
                case 2:
                    paperBookMenu(manager, scanner);
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }

        scanner.close();
    }

    public static void ebookMenu(Manager manager, Scanner scanner) {
        System.out.println("\n=== EBook 메뉴 ===");
        System.out.println("1. EBook 추가");
        System.out.println("2. EBook 제목 변경");
        System.out.println("3. 모든 EBook 출력");
        System.out.print("선택: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        switch (choice) {
            case 1:
                // EBook 추가
                System.out.print("제목: ");
                String title = scanner.nextLine();
                System.out.print("저자: ");
                String author = scanner.nextLine();
                System.out.print("ISBN: ");
                String ISBN = scanner.nextLine();
                System.out.print("가격: ");
                double price = scanner.nextDouble();
                System.out.print("페이지 수: ");
                int page = scanner.nextInt();
                System.out.print("파일 크기(MB): ");
                double fileSize = scanner.nextDouble();
                scanner.nextLine(); // 버퍼 비우기
                System.out.print("다운로드 링크: ");
                String downloadLink = scanner.nextLine();

                EBook ebook = new EBook(title, author, ISBN, price, page, fileSize, downloadLink);
                manager.addBook(ebook);
                System.out.println("EBook 추가 완료.");
                break;
            case 2:
                // EBook 제목 변경
                System.out.print("제목을 변경할 EBook의 ISBN: ");
                String isbnToChange = scanner.nextLine();
                Book foundBook = manager.findBookByISBN(isbnToChange);
                if (foundBook != null && foundBook instanceof EBook) {
                    System.out.print("새로운 제목: ");
                    String newTitle = scanner.nextLine();
                    // EBook 클래스에 setTitle이 있다고 가정
                    foundBook.setTitle(newTitle);
                    System.out.println("제목 변경 완료.");
                } else {
                    System.out.println("해당 ISBN의 EBook을 찾을 수 없습니다.");
                }
                break;
            case 3:
                // 모든 책 출력
                manager.printAllBooks();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

    public static void paperBookMenu(Manager manager, Scanner scanner) {
        System.out.println("\n=== PaperBook 메뉴 ===");
        System.out.println("1. PaperBook 추가");
        System.out.println("2. PaperBook 재고 증가");
        System.out.println("3. 모든 PaperBook 출력");
        System.out.print("선택: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        switch (choice) {
            case 1:
                // PaperBook 추가
                System.out.print("제목: ");
                String title = scanner.nextLine();
                System.out.print("저자: ");
                String author = scanner.nextLine();
                System.out.print("ISBN: ");
                String ISBN = scanner.nextLine();
                System.out.print("가격: ");
                double price = scanner.nextDouble();
                System.out.print("페이지 수: ");
                int page = scanner.nextInt();
                System.out.print("재고: ");
                int stock = scanner.nextInt();
                scanner.nextLine();
                System.out.print("출판사: ");
                String publisher = scanner.nextLine();

                PaperBook pbook = new PaperBook(title, author, ISBN, price, page, stock, publisher);
                manager.addBook(pbook);
                System.out.println("PaperBook 추가 완료.");
                break;
            case 2:
                // PaperBook 재고 증가
                System.out.print("재고를 변경할 PaperBook의 ISBN: ");
                String isbnForStock = scanner.nextLine();
                Book foundBook = manager.findBookByISBN(isbnForStock);
                if (foundBook != null && foundBook instanceof PaperBook) {
                    System.out.print("추가할 재고 수: ");
                    int addStock = scanner.nextInt();
                    ((PaperBook)foundBook).increaseStock(addStock);
                    System.out.println("재고 추가 완료.");
                } else {
                    System.out.println("해당 ISBN의 PaperBook을 찾을 수 없습니다.");
                }
                break;
            case 3:
                // 모든 책 출력
                manager.printAllBooks();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }
}
