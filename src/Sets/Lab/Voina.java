package Sets.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        int count = 0;
        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            count++;
            if (count == 50) {
                break;
            }
            Integer first = firstDeck.iterator().next();
            firstDeck.remove(first);

            Integer second = secondDeck.iterator().next();
            secondDeck.remove(second);

            if(first>second){
                firstDeck.add(first);
                firstDeck.add(second);
            } else if (second>first) {
                secondDeck.add(first);
                secondDeck.add(second);
            }
        }
        if(firstDeck.size()> secondDeck.size()){
            System.out.println("First player win!");
        } else if (firstDeck.size()< secondDeck.size()) {
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");
        }
    }
}
