import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> listOfOccurrences = new LinkedHashMap<>();

        for (double number : numbers) {
            listOfOccurrences.putIfAbsent(number, 0);
            listOfOccurrences.put(number, listOfOccurrences.get(number) + 1);
        }

        for (Map.Entry<Double, Integer> entry : listOfOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d\n",entry.getKey() ,entry.getValue());
        }
    }
}
