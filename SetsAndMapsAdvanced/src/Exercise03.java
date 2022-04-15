import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < lines; i++) {
            String[] elementsToAdd = scan.nextLine().split("\\s+");
            for (String ele : elementsToAdd) {
                elements.add(ele);
            }
        }

//        for (String element : elements) {
//            System.out.print(element + " ");
//        }
        System.out.println(elements.toString().replaceAll("[\\[\\],]", ""));
    }
}
