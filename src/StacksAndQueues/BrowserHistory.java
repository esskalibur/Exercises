package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nextDirectory = scanner.nextLine();
        String currentURL = "blank";
        ArrayDeque<String> history = new ArrayDeque<>();
        while (!nextDirectory.equals("Home")) {
            if (nextDirectory.equals("back")) {
                if (!history.isEmpty()) {
                    currentURL = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    nextDirectory = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentURL.equals("blank")) {
                    history.push(currentURL);
                }
                currentURL = nextDirectory;
            }
            System.out.println(currentURL);
            nextDirectory = scanner.nextLine();
        }
    }
}
