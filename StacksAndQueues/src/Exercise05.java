import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] input = scan.nextLine().toCharArray();
        if(input.length % 2 != 0 || input.length == 0){
            System.out.println("NO");
            return;
        }
        ArrayDeque<Character> brackets = new ArrayDeque<>();
        boolean isBalanced = true;

        for (int i = 0; i < input.length; i++) {
            if(input[i] == '(' || input[i] == '{' || input[i] == '['){
                brackets.push(input[i]);
            } else if(!brackets.isEmpty() && input[i] != '(' && input[i] != '{' && input[i] != '['){
                if(input[i] == ')' && brackets.pop() != '('){
                    isBalanced = false;
                    break;
                } else if (input[i] == '}' && brackets.pop() != '{'){
                    isBalanced = false;
                    break;
                } else if(input[i] == ']' && brackets.pop() != '['){
                    isBalanced = false;
                    break;
                }
            }
        }

        if(isBalanced){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
