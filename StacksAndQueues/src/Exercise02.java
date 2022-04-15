import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int elementsToPush = scan.nextInt();
        int elementsToPop = scan.nextInt();
        int numberToLookFor = scan.nextInt();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            numbers.push(scan.nextInt());
        }

        for (int i = 0; i < elementsToPop; i++) {
            numbers.pop();
        }

        boolean containsNumber = numbers.contains(numberToLookFor);

        if (containsNumber) {
            System.out.println("true");
        } else if (numbers.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(numbers.stream().mapToInt(e -> e).min().getAsInt());
        }
    }
}
