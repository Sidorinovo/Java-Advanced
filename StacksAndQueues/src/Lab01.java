import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();

        while (!"Home".equals(input)) {

            switch (input) {

                case "back":

                    if (history.size() < 2) {
                        System.out.println("no previous URLs");
                    } else {
                        history.pop();
                        System.out.println(history.peek());
                    }
                    break;


                default:
                    history.push(input);
                    System.out.println(history.peek());
                    break;
            }

            input = scan.nextLine();
        }
    }
}
