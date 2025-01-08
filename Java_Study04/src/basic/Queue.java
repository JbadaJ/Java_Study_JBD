package basic;

public class Queue {
    private static final int MAX_SIZE = 5; // 큐의 최대 크기
    private int[] arr;                    // 큐를 저장할 배열
    private int front;                    // 큐의 맨 앞(제거 위치)
    private int rear;                     // 큐의 맨 뒤(추가 위치)
    private int size;                     // 현재 저장된 원소 수

    public Queue() {
        arr = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    // 큐가 가득 찼는지 확인
    public boolean isFull() {
        return (size == MAX_SIZE);
    }

    // 큐가 비었는지 확인
    public boolean isEmpty() {
        return (size == 0);
    }

    // 큐에 데이터 추가 (enqueue)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Enqueue failed.");
            return;
        }
        // rear를 한 칸 이동 (원형 구조로)
        rear = (rear + 1) % MAX_SIZE;
        arr[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    // 큐에서 데이터 제거 (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Dequeue failed.");
            return -1; // 예시로 -1을 오류값으로 사용
        }
        int removedValue = arr[front];
        // front를 한 칸 이동 (원형 구조로)
        front = (front + 1) % MAX_SIZE;
        size--;
        System.out.println("Dequeued: " + removedValue);
        return removedValue;
    }

    // 큐의 맨 앞(front) 데이터 확인
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Peek failed.");
            return -1; // 예시 오류값
        }
        return arr[front];
    }

    // 테스트용 메인
    public static void main(String[] args) {
        Queue queue = new Queue();

        // 큐에 데이터 추가
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // 이미 꽉 찼으므로 실패 메시지
        queue.enqueue(60);

        // 현재 front=0 → 10
        System.out.println("Peek: " + queue.peek()); // 10

        // 큐에서 몇 개 제거
        queue.dequeue(); // 10 제거
        queue.dequeue(); // 20 제거

        // 다시 enqueue 가능
        queue.enqueue(60); // 성공
        queue.enqueue(70); // 다시 가득 참

        while (!queue.isEmpty()) {
            System.out.println("Poll all: " + queue.dequeue());
        }
    }
}
