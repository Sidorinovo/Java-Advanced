package Lab03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scale<String> scale = new Scale<>("a", "b");
        System.out.println(scale.getHeavier());
        Scale<Integer> scaleTwo = new Scale<>(1, 2);
        System.out.println(scaleTwo.getHeavier());
    }
}
