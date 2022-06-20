package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = compareMetrices(firstMatrix, secondMatrix);

        String output = areEqual ? "equal" : "not equal";
         System.out.println(output);
    }

    public static boolean compareMetrices(int[][] firstMatrix, int[][] secondMatrix) {
        for (int row = 0; row < firstMatrix.length; row += 1) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];
            for (int col = 0; col < firstArr.length; col += 1) {
                int firstElement = firstArr[col];
                int secondElement = secondArr[col];

                if (firstElement != secondElement) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readMatrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row += 1) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[row] = arr;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
