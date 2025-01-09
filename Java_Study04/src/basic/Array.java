package basic;

import java.util.Scanner;

public class Array {
    private static final int MAX_SIZE = 5; // 배열 크기
    private int[] arr;                     // 데이터 저장할 배열
    private int count;                     // 현재 원소 수

    public Array() {
        arr = new int[MAX_SIZE];
        count = 0; // 처음에는 0개
    }

    // 1) 추가 (insert)
    public void add(int value) {
        // 배열이 가득 찼는지 확인
        if (count == MAX_SIZE) {
            System.out.println("더 이상 추가할 수 없습니다 (배열이 가득 참).");
            return;
        }
        // count 위치에 저장 후 count++
        arr[count] = value;
        count++;
        System.out.println("추가 완료: " + value);
    }

    // 2) 수정 (update)
    // index 위치의 값을 newValue로 변경
    public void update(int index, int newValue) {
        // 유효한 인덱스인지 확인
        if (index < 0 || index >= count) {
            System.out.println("수정 실패: 잘못된 인덱스입니다.");
            return;
        }
        // 수정 수행
        arr[index] = newValue;
        System.out.println("수정 완료: " + index + "번 요소를 " + newValue + "(으)로 변경");
    }

    // 3) 삭제 (delete)
    // index 위치의 값을 제거 후 뒤쪽 데이터를 한 칸씩 당김
    public void delete(int index) {
        // 유효한 인덱스인지 확인
        if (index < 0 || index >= count) {
            System.out.println("삭제 실패: 잘못된 인덱스입니다.");
            return;
        }

        int deletedValue = arr[index];

        // 뒤의 데이터를 앞으로 한 칸씩 이동
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // 마지막 위치는 사용 안 함
        count--;
        System.out.println("삭제 완료: " + deletedValue + " (인덱스 " + index + ")");
    }

    // 배열에 저장된 데이터 출력
    public void printAll() {
        if (count == 0) {
            System.out.println("현재 저장된 데이터가 없습니다.");
            return;
        }
        System.out.print("현재 데이터: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 메인 메서드: 실행 예시
    public static void main(String[] args) {
        Array crud = new Array();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. 추가 (Add)");
            System.out.println("2. 수정 (Update)");
            System.out.println("3. 삭제 (Delete)");
            System.out.println("4. 전체 데이터 출력 (Print)");
            System.out.println("0. 종료 (Exit)");
            System.out.print("번호 선택: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1: // 추가
                    System.out.print("추가할 값 입력: ");
                    int value = scanner.nextInt();
                    crud.add(value);
                    break;
                case 2: // 수정
                    System.out.print("수정할 인덱스 입력(0 ~ " + (crud.count - 1) + "): ");
                    int upIndex = scanner.nextInt();
                    System.out.print("새로운 값 입력: ");
                    int newValue = scanner.nextInt();
                    crud.update(upIndex, newValue);
                    break;
                case 3: // 삭제
                    System.out.print("삭제할 인덱스 입력(0 ~ " + (crud.count - 1) + "): ");
                    int delIndex = scanner.nextInt();
                    crud.delete(delIndex);
                    break;
                case 4: // 출력
                    crud.printAll();
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }

        scanner.close();
    }
}
