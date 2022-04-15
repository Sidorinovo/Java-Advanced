package Exercise05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numEngines = Integer.parseInt(scan.nextLine());

        Map<String, Engine> engines = new HashMap<>();

        for (int i = 0; i < numEngines; i++) {
            String[] engineDetails = scan.nextLine().split("\\s+");
            String model = engineDetails[0];
            int power = Integer.parseInt(engineDetails[1]);

            if (engineDetails.length == 3 && Character.isLetter(engineDetails[2].charAt(0))) {
                String engineEfficiency = engineDetails[2];
                engines.put(model, new Engine(model, power, engineEfficiency));
            } else if (engineDetails.length == 3 && Character.isDigit(engineDetails[2].charAt(0))){
                int engineDisplacement = Integer.parseInt(engineDetails[2]);
                engines.put(model, new Engine(model, power, engineDisplacement));
            } else if(engineDetails.length == 4){
                int engineDisplacement = Integer.parseInt(engineDetails[2]);
                String engineEfficiency = engineDetails[3];
                engines.put(model, new Engine(model, power, engineDisplacement, engineEfficiency));
            } else {
                engines.put(model, new Engine(model, power));
            }
        }

        int numCars = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numCars; i++) {
            String[] carDetails = scan.nextLine().split("\\s+");
            String model = carDetails[0];
            String engine = carDetails[1];

            if(carDetails.length == 3 && Character.isLetter(carDetails[2].charAt(0))){
                String color = carDetails[2];
                Car car = new Car(model, engines.get(engine), color);
                System.out.println(car);
            } else if(carDetails.length == 3 && Character.isDigit(carDetails[2].charAt(0))){
                int weight = Integer.parseInt(carDetails[2]);
                Car car = new Car(model, engines.get(engine), weight);
                System.out.println(car);
            } else if(carDetails.length == 4){
                int weight = Integer.parseInt(carDetails[2]);
                String color = carDetails[3];
                Car car = new Car(model, engines.get(engine), weight, color);
                System.out.println(car);
            } else {
                Car car = new Car(model, engines.get(engine));
                System.out.println(car);
            }
        }
    }
}
