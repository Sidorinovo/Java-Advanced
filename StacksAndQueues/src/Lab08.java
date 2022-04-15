import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        ArrayDeque<String> backAddresses = new ArrayDeque<>();
        ArrayDeque<String> forwardAddresses = new ArrayDeque<>();

        while (!"Home".equals(input)) {

            switch (input) {

                case "back":

                    if (backAddresses.size() < 2) {
                        System.out.println("no previous URLs");
                    } else {
                        forwardAddresses.push(backAddresses.pop());
                        System.out.println(backAddresses.peek());
                    }
                    break;

                case "forward":

                    if (forwardAddresses.isEmpty()) {
                        System.out.println("no next URLs");
                    } else {
                        System.out.println(forwardAddresses.peek());
                        backAddresses.push(forwardAddresses.pop());
                    }
                    break;

                default:
                    backAddresses.push(input);
                    forwardAddresses.clear();
                    System.out.println(backAddresses.peek());
                    break;
            }

            input = scan.nextLine();
        }
    }
}
