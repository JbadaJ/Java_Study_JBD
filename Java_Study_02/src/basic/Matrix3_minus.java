package basic;

import java.util.Scanner;

public class Matrix3_minus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // 첫 번째 행렬 생성 및 값 입력받기
        System.out.println("Enter elements for the first matrix:");
        int[][] matrix1 = createAndFillMatrix(rows, cols, scanner);

        // 두 번째 행렬 생성 및 값 입력받기
        System.out.println("Enter elements for the second matrix:");
        int[][] matrix2 = createAndFillMatrix(rows, cols, scanner);

        // 행렬 출력
        System.out.println("First Matrix:");
        printMatrix(matrix1);

        System.out.println("Second Matrix:");
        printMatrix(matrix2);

        // 두 행렬 덧셈 수행
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Sum of Matrices:");
        printMatrix(sumMatrix);

        // 두 행렬 뺄셈 수행
        int[][] diffMatrix = subtractMatrices(matrix1, matrix2);
        System.out.println("Difference of Matrices:");
        printMatrix(diffMatrix);

        scanner.close();
    }

    /**
     * 사용자로부터 행렬 요소를 입력받아 행렬을 생성
     * 
     * @param rows    행의 개수
     * @param cols    열의 개수
     * @param scanner 사용자 입력 스캐너
     * @return 생성된 행렬
     */
    public static int[][] createAndFillMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    /**
     * 두 행렬의 덧셈 수행
     * 
     * @param matrix1 첫 번째 행렬
     * @param matrix2 두 번째 행렬
     * @return 두 행렬의 합
     */
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    /**
     * 두 행렬의 뺄셈 수행
     * 
     * @param matrix1 첫 번째 행렬
     * @param matrix2 두 번째 행렬
     * @return 두 행렬의 차
     */
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] diffMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diffMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return diffMatrix;
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
