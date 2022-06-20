package Sets.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SoftUniParty1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();

        String resNum = scanner.nextLine();
        while (!resNum.equals("PARTY")) {
            char startSymbol = resNum.charAt(0);
            boolean isVipReg = Character.isDigit(startSymbol);
            if (isVipReg) {
                vip.add(resNum);
            } else {
                regular.add(resNum);
            }
            resNum = scanner.nextLine();
        }
        String guestNum=scanner.nextLine();
        while (!guestNum.equals("END")){
            vip.remove(guestNum);
            regular.remove(guestNum);
            guestNum=scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());

        System.out.println(String.join(System.lineSeparator(), vip));
        System.out.println(String.join(System.lineSeparator(), regular));
    }
}
