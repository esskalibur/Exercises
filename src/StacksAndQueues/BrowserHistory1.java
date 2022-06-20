package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nextNav = scanner.nextLine();
        String currentURL = "blank";
        ArrayDeque<String> history = new ArrayDeque<>();
        while (!nextNav.equals("Home")) {
            if (nextNav.equals("back")) {
                if(!history.isEmpty()){
                    currentURL = history.pop();
                }else {
                    System.out.println("no previous URLs");
                    nextNav = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentURL.equals("blank")) {
                    history.push(currentURL);
                }
                currentURL = nextNav;
            }
            System.out.println(currentURL);
            nextNav = scanner.nextLine();
        }
    }
}
