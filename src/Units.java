import java.util.Arrays;
import java.util.Scanner;

public class Units {
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
