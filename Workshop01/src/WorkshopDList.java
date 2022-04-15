import java.util.Scanner;

public class WorkshopDList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DList list = new DList();

        for (int i = 1; i <= 5; i++) {
            list.addLast(i);
        }
        list.forEach(System.out::println);
        System.out.println(list.get(2));
        System.out.println(list.removeFirst());
        int[] arr = list.toArray();
        System.out.println();
    }
}
