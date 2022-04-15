import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < lines; i++) {
            int[] command = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            switch (command[0]) {
                case 1:
                    numbers.push(command[1]);
                    break;
                case 2:
                    numbers.pop();
                    break;
                case 3:
                    System.out.println(numbers.stream().mapToInt(e -> e).max().getAsInt());
                    break;
            }
        }
    }
}
