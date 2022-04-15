import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        int sum = 0;
        BiFunction<Integer, Integer, Integer> summer = ((a, b) -> a + b);

        for (int number : numbers) {
            count++;
            sum = summer.apply(number, sum);
        }

        System.out.println(count);
        System.out.println(sum);
    }
}
