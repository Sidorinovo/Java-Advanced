import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        if(num == 0){
            System.out.println(0);
            return;
        }
        ArrayDeque<String> result = new ArrayDeque<>();

        while(num != 0){
            result.push(String.valueOf(num % 2));
            num /= 2;
        }
        System.out.println(result.toString().replaceAll("[\\[\\], ]", ""));
    }
}
