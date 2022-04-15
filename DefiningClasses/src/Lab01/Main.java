package Lab01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));

        List<Car> cars = new ArrayList<>();
        int lines = Integer.parseInt(br.readLine());

        for (int i = 0; i < lines; i++) {
            String[] carDetails = br.readLine().split("\\s+");
            String brand = carDetails[0];

            if (carDetails.length == 3) {
                String model = carDetails[1];
                int horsePower = Integer.parseInt(carDetails[2]);
                cars.add(new Car(brand, model, horsePower));
            } else {
                cars.add(new Car(brand));
            }

        }

        for (Car car : cars) {
            pr.println(car.carInfo());
        }
        pr.flush();
        pr.close();
    }
}
