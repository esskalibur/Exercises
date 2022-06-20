import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= number; i += 1) {
            if (numberDivisibleBy8(i) && numberOddDigit(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean numberOddDigit(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    private static boolean numberDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
            }
        if (sum % 8 == 0) {
            return true;
        }
        return false;
    }
}
