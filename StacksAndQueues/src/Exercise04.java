import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbersToAdd = scan.nextInt();
        int numbersToRemove = scan.nextInt();
        int numberToFind = scan.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numbersToAdd; i++) {
            queue.add(scan.nextInt());
        }

        for (int i = 0; i < numbersToRemove; i++) {
            queue.remove();
        }

        if (queue.contains(numberToFind)) {
            System.out.println("true");
        } else if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(queue.stream().mapToInt(e -> e).min().getAsInt());
        }
    }
}
