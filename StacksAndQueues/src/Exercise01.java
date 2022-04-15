import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            numbers.push(Integer.parseInt(input[i]));
        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.pop() + " ");
        }
    }
}
