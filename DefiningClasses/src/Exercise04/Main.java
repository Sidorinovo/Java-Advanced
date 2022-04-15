package Exercise04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());
        Set<Car> cars = new LinkedHashSet<>();

        for (int i = 0; i < input; i++) {
            String[] carDetails = scan.nextLine().split("\\s+");
            String carModel = carDetails[0];
            int engineSpeed = Integer.parseInt(carDetails[1]);
            int enginePower = Integer.parseInt(carDetails[2]);
            int cargoWeight = Integer.parseInt(carDetails[3]);
            String cargoType = carDetails[4];
            double tyreOnePressure = Double.parseDouble(carDetails[5]);
            int tyreOneAge = Integer.parseInt(carDetails[6]);
            double tyreTwoPressure = Double.parseDouble(carDetails[7]);
            int tyreTwoAge = Integer.parseInt(carDetails[8]);
            double tyreThreePressure = Double.parseDouble(carDetails[9]);
            int tyreThreeAge = Integer.parseInt(carDetails[10]);
            double tyreFourPressure = Double.parseDouble(carDetails[11]);
            int tyreFourAge = Integer.parseInt(carDetails[12]);

            Engine currentEngine = new Engine(engineSpeed, enginePower);
            Cargo currentCargo = new Cargo(cargoWeight, cargoType);
            Tyre[] tires = new Tyre[4];
            tires[0] = new Tyre(tyreOnePressure, tyreOneAge);
            tires[1] = new Tyre(tyreTwoPressure, tyreTwoAge);
            tires[2] = new Tyre(tyreThreePressure, tyreThreeAge);
            tires[3] = new Tyre(tyreFourPressure, tyreFourAge);

            Car currentCar = new Car(carModel, currentEngine, currentCargo, tires);
            cars.add(currentCar);
        }

        String requirements = scan.nextLine();

        switch (requirements) {
            case "fragile":
                for (Car car : cars) {
                    if(car.getCargo().getType().equals("fragile")){
                        for (Tyre tire : car.getTires()) {
                            if(tire.getPressure() < 1){
                                System.out.println(car.getModel());
                                break;
                            }
                        }
                    }
                }
                break;
            case "flamable":
                for (Car car : cars) {
                    if(car.getCargo().getType().equals("flamable") && car.getEngine().getPower() > 250){
                        System.out.println(car.getModel());
                    }
                }
                break;
        }
    }
}
