import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxCount = 0;
        int index = 0;
        int bestSeq = 0;
        for (int i = 0; i < input.length; i += 1) {
            int count = 0;
            for (int j = i; j < input.length; j += 1) {
                if (input[i] == input[j]) {
                    count += 1;
                    index = i;
                    if (count >= maxCount) {
                        maxCount = count;
                        bestSeq = index;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < maxCount; i += 1) {
            System.out.print(input[i + bestSeq] + " ");
        }
    }
}
