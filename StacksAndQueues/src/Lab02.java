import java.util.ArrayDeque;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        ArrayDeque<String> expression = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            expression.add(input[i]);
        }

        while(expression.size() > 1){
            int num1 = Integer.parseInt(expression.pop());
            String operator = expression.pop();
            int num2 = Integer.parseInt(expression.pop());

            if(operator.equals("-")){
                expression.push(String.valueOf(num1 - num2));
            } else {
                expression.push(String.valueOf(num1 + num2));
            }
        }
        System.out.println(expression.peek());
    }
}
