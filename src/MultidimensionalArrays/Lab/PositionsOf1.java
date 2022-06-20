package MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static MultidimensionalArrays.Lab.CompareMatrices1.readMatrix;

public class PositionsOf1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);
        int num = Integer.parseInt(scanner.nextLine());
        ArrayList<String> outputLine = new ArrayList<>();

        for (int row = 0; row < matrix.length; row += 1) {
            for (int cols = 0; cols < matrix[row].length; cols += 1) {
                if (matrix[row][cols] == num) {
                    outputLine.add(row + " " + cols);
                }
            }
        }
        if (outputLine.isEmpty()){
             System.out.println("not found");
        }else {
            for (String s : outputLine) {
                System.out.println(s);
            }
        }
    }

    public static int[][] readMetrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i += 1) {
            int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = array;
        }
        return matrix;
    }
}
