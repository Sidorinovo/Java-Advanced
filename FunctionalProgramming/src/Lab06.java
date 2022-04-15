import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Lab06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Predicate<Integer> isOdd = e -> e % 2 != 0;
//        Predicate<Integer> isEven = e -> e % 2 == 0;

        String[] input = scan.nextLine().split("\\s+");
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        populateOdd(input, oddNumbers, e -> e % 2 != 0);
        populateEven(input, evenNumbers, e -> e % 2 == 0);
        String command = scan.nextLine();

        if("odd".equals(command)){
            oddNumbers.forEach(e ->System.out.print(e + " "));
        } else if("even".equals(command)){
            evenNumbers.forEach(e ->System.out.print(e + " "));
        }
    }

    public static void populateOdd(String[] input, List<Integer> oddNumbers, Predicate<Integer> isOdd) {
        int from = Integer.parseInt(input[0]);
        int to = Integer.parseInt(input[1]);
        for (int i = from; i <= to; i++) {
            if(isOdd.test(i)){
                oddNumbers.add(i);
            }
        }
    }

    public static void populateEven(String[] input, List<Integer> evenNumbers, Predicate<Integer> isEven) {
        int from = Integer.parseInt(input[0]);
        int to = Integer.parseInt(input[1]);
        for (int i = from; i <= to; i++) {
            if(isEven.test(i)){
                evenNumbers.add(i);
            }
        }
    }
}
