package MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][4];
        int start = 1;
        for (int i = 0; i < 3; i += 1) {
            int[] arr = new int[4];
            for(int j=0;j<arr.length;j+=1){
                arr[j]=start;
                start++;
            }
            matrix[i]=arr;
        }
         System.out.println();
    }
}

