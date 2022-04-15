import java.util.*;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Set<String> listOfCars = new LinkedHashSet<>();

        while (!"END".equals(input)) {

            String command = input.split(", ")[0];
            String plateNumber = input.split(", ")[1];

            switch (command) {
                case "IN":
                    listOfCars.add(plateNumber);
                    break;
                case "OUT":
                    listOfCars.remove(plateNumber);
                    break;
            }

            input = scan.nextLine();
        }

        if (listOfCars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : listOfCars) {
                System.out.println(car);
            }
        }
    }
}
