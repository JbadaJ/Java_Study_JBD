package basic;

import java.util.Scanner;

public class Matrix3_multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();

        System.out.print("Enter number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();

        System.out.println("Enter elements for the first matrix:");
        int[][] matrix1 = createAndFillMatrix(rows1, cols1, scanner);

        System.out.print("Enter number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();

        System.out.print("Enter number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible (columns of first matrix != rows of second matrix).");
        } else {
            System.out.println("Enter elements for the second matrix:");
            int[][] matrix2 = createAndFillMatrix(rows2, cols2, scanner);

            System.out.println("First Matrix:");
            printMatrix(matrix1);

            System.out.println("Second Matrix:");
            printMatrix(matrix2);

            // 행렬 곱셈 수행
            int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
            System.out.println("Product of Matrices:");
            printMatrix(productMatrix);
        }

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
     * 두 행렬의 곱셈 수행
     * 
     * @param matrix1 첫 번째 행렬
     * @param matrix2 두 번째 행렬
     * @return 두 행렬의 곱
     */
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] productMatrix = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                productMatrix[i][j] = 0; // 초기화
                for (int k = 0; k < cols1; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return productMatrix;
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
