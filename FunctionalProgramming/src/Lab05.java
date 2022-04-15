import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.*;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        Map<String, Integer> people = new HashMap<>();

        for (int i = 0; i < lines; i++) {
            String input = scan.nextLine();
            String name = input.split(", ")[0];
            int age = Integer.parseInt(input.split(", ")[1]);
            people.put(name, age);
        }

        String condition = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String format = scan.nextLine();

        Predicate<Integer> tester = createTester(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);

        printFilteredStudents(people, tester, printer);
    }

    public static void printFilteredStudents(Map<String, Integer> people, Predicate<Integer> tester, Consumer<Map.Entry<String, Integer>> printer){
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if(tester.test(person.getValue())){
                printer.accept(person);
            }
        }
    }

    public static Consumer<Map.Entry<String, Integer>> createPrinter(String format) {
        Consumer<Map.Entry<String, Integer>> printer = null;
        switch (format) {

            case "name age":
                printer = e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue());
                break;
            case "name":
                printer = e -> System.out.printf("%s%n", e.getKey());
                break;
            case "age":
                printer = e -> System.out.printf("%d%n", e.getValue());
                break;
        }
        return printer;
    }

    public static Predicate<Integer> createTester(String condition, int age) {
        switch (condition) {
            case "older":
                return x -> x >= age;

            case "younger":
                return x -> x <= age;

        }
        return null;
    }
}