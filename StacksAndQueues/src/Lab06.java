import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(" ");
        ArrayDeque<String> players = new ArrayDeque<>();
        for (int i = 0; i < names.length; i++) {
            players.offer(names[i]);
        }
        int iterations = Integer.parseInt(scan.nextLine());

        while (players.size() > 1) {

            for (int i = 1; i < iterations; i++) {
                players.offer(players.poll());
            }
            System.out.printf("Removed %s\n", players.poll());
        }

        System.out.printf("Last is %s\n", players.poll());
    }
}
