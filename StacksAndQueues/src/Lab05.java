import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<String> printQueue = new ArrayDeque<>();

        while(!"print".equals(input)){
            if(!"cancel".equals(input)){
                printQueue.offer(input);
            } else {
                if(printQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s\n", printQueue.poll());
                }
            }

            input = scan.nextLine();
        }
        while(!printQueue.isEmpty()){
            System.out.println(printQueue.poll());
        }
    }
}
