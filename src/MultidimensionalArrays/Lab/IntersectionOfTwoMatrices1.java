package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = getMatrix(scanner, rows, cols);
        char[][] secondMatrix = getMatrix(scanner, rows, cols);

        char[][] output = new char[rows][cols];

        for (int row = 0; row < rows; row += 1) {
            for (int col = 0; col < cols; col += 1) {
                char firstElement = firstMatrix[row][col];
                char secondElement = secondMatrix[row][col];
                char fillChar = firstElement == secondElement ? firstElement : '*';
                output[row][col] = fillChar;
            }
        }
        for (char[] chars : output) {
            for (char s : chars) {
                System.out.print(s + " ");
            }
             System.out.println();
        }

    }

    private static char[][] getMatrix(Scanner scanner, int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row += 1) {
            matrix[row] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        }
        return matrix;
    }
}
