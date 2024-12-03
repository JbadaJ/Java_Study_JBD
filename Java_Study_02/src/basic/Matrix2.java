package basic;
import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // 행렬 생성 및 값 입력받기
        int[][] matrix = createAndFillMatrix(rows, cols, scanner);

        // 행렬 출력
        System.out.println("Generated Matrix:");
        printMatrix(matrix);

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
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                //scanner.nextLine();
            }
        }
        return matrix;
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
