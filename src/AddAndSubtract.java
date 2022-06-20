
import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

       while (!input.equals("END")){
           int number=Integer.parseInt(input);
            System.out.println(checkIsPalinrome(number));
           input = scanner.nextLine();
       }
    }
    static public boolean checkIsPalinrome(int number){
        boolean result=false;
        int temp=number;
        int reverse=0;
        while (number>0){
            reverse=reverse*10;
            reverse=reverse+number%10;
            number=number/10;
        }
        if(reverse==temp){
            result=true;
        }
        return result;
    }
}
