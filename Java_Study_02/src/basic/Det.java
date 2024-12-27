package basic;

import java.util.Scanner;

public class Det {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2x2 행렬 선언
        double[][] matrix = new double[2][2];

        // 사용자로부터 2x2 행렬 요소 입력받기
        System.out.println("2x2 행렬을 입력하세요:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // 행렬 출력
        System.out.println("\n입력된 행렬:");
        printMatrix(matrix);

        // 행렬식(det(A)) 계산
        double determinant = calcDet2x2(matrix);

        // 결과 출력
        System.out.println("\nDet(A) = " + determinant);

        scanner.close();
    }

    /**
     * 2x2 행렬의 행렬식을 계산하는 함수
     * | a b |
     * | c d | 의 행렬식 = ad - bc
     */
    public static double calcDet2x2(double[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    /**
     * 2x2 행렬을 출력하는 함수
     */
    public static void printMatrix(double[][] mat) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
