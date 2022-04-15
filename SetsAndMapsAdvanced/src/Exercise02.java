import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstSetLength = scan.nextInt();
        int secondSetLength = scan.nextInt();
        scan.nextLine();

        Set<Integer> first = new LinkedHashSet<>();
        Set<Integer> second = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength; i++) {
            first.add(Integer.parseInt(scan.nextLine()));
        }
        for (int i = 0; i < secondSetLength; i++) {
            second.add(Integer.parseInt(scan.nextLine()));
        }

        for (Integer num : first) {
            if(first.contains(num) && second.contains(num)){
                System.out.print(num + " ");
            }
        }
    }
}
