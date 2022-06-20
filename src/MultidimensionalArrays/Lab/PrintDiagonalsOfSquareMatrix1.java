package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int r = 0; r < size; r += 1) {
            matrix[r] = Arrays.stream(scanner.nextLine()
                    .split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        for (int index = 0; index < size; index += 1) {
            System.out.print(matrix[index][index] + " ");
        }
        System.out.println();

        int row = size - 1;
        int col = 0;

        while (isInBounds(row, col, matrix)) {
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }
    }

    private static boolean isInBounds(int row, int col, int[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
    public static boolean isOutOfBounds(int row,int col,int[][]matrix){
        return !isInBounds(row, col, matrix);
    }
}
