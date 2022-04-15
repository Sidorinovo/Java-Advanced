import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function<Integer, Boolean> func = integer -> integer % 2 == 0;


        List<Integer> evenNumbers = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(func::apply).boxed().collect(Collectors.toList());

        System.out.println(evenNumbers.toString().replaceAll("[\\[\\]]", ""));

        evenNumbers = evenNumbers.stream()
                .sorted(Integer::compare).collect(Collectors.toList());

        System.out.println(evenNumbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
