import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < num; i++) {
            String name = scan.nextLine();
            names.add(name);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
