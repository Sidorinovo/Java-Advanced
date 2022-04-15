package Lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Jar<Integer> numbers = new Jar<>();
        Jar<String> strings = new Jar<>();

        numbers.add(13);
        strings.add("Pesho");
    }
}
