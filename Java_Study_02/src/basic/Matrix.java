package basic;

import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // 행렬 생성
        int[][] matrix = createMatrix(rows, cols);

        // 행렬 출력
        System.out.println("Generated Matrix:");
        printMatrix(matrix);

        scanner.close();
    }

    /**
     * 주어진 크기의 행렬을 생성 (내용물은 모두 0)
     * 
     * @param rows 행의 개수
     * @param cols 열의 개수
     * @return 생성된 행렬
     */
    public static int[][] createMatrix(int rows, int cols) {
        return new int[rows][cols]; // 모든 요소는 기본값 0으로 초기화
    }

    /**
     * 행렬 출력
     * 
     * @param matrix 출력할 행렬
     */
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { // 각 행 반복
            for (int j = 0; j < matrix[i].length; j++) { // 각 열 반복
                System.out.print(matrix[i][j] + " "); // 요소 출력
            }
            System.out.println(); // 줄바꿈
        }
    }
}

