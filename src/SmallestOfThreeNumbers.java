import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

//       •	6 – 10 characters (inclusive);
//•	Consists only of letters and digits;
//•	Have at least 2 digits.

        passLength(pass);

        passConsistsOnlyLettersAndDigits(pass);

        passHaveAtLeast2Digits(pass);

        if (passLength(pass) && passConsistsOnlyLettersAndDigits(pass) && passHaveAtLeast2Digits(pass)) {
            System.out.println("Password is valid");
        }
        if (!passLength(pass)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!passConsistsOnlyLettersAndDigits(pass)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!passHaveAtLeast2Digits(pass)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean passLength(String pass) {
        return (pass.length() >= 6 && pass.length() <= 10);
    }

    public static boolean passConsistsOnlyLettersAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i += 1) {
            char symbol = pass.toLowerCase().charAt(i);
            if ((symbol < 97 || symbol > 122) && (symbol < 48 || symbol > 57)) {
                return false;
            }
        }
        return true;
    }

    public static boolean passHaveAtLeast2Digits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i += 1) {
            char symbol = pass.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                count += 1;
                if (count == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
