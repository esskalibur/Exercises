package Sets.Lab;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> cars = new LinkedHashSet<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            String[] tokens = input.split(", ");
            String direction = tokens[0];
            String carRegistration = tokens[1];
            if (direction.equals("IN")) {
                cars.add(carRegistration);
            } else {
                cars.remove(carRegistration);
            }
            input = scanner.nextLine();
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(String.join(System.lineSeparator(), cars));
        }
    }
}
