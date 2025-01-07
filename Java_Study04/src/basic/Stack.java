package basic;

public class Stack {
    // 스택의 최대 크기
    private static final int MAX_SIZE = 5;

    // 스택 데이터를 저장할 배열
    private int[] arr;
    // 스택의 최상단(top)을 가리키는 인덱스
    private int top;

    // 생성자에서 배열 초기화 & top 초기화
    public Stack() {
        arr = new int[MAX_SIZE];
        top = -1; // 스택이 비어있음을 의미
    }

    // push: top을 하나 증가시키고 거기에 새 데이터를 저장
    public void push(int value) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow (스택이 가득 찼습니다)");
            return;
        }
        arr[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // pop: top 위치의 데이터를 반환한 후 top을 하나 감소
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow (스택이 비어있습니다)");
            return -1;  // 오류값 예시
        }
        int poppedValue = arr[top];
        top--;
        System.out.println("Popped: " + poppedValue);
        return poppedValue;
    }

    // peek: top 위치의 데이터(최상단 값)을 반환(제거는 안 함)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty (스택이 비어있습니다)");
            return -1;  // 오류값 예시
        }
        return arr[top];
    }

    // 스택이 비었는지 확인
    public boolean isEmpty() {
        return (top == -1);
    }

    // 동작 테스트
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // peek 확인

        stack.pop(); // 30 제거
        stack.pop(); // 20 제거

        System.out.println("Top element: " + stack.peek()); // 10

        stack.pop(); // 10 제거
        stack.pop(); // 이미 비어있으므로 Underflow
    }
}
