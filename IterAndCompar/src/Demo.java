import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        print(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println("Sido");

    }

    @SafeVarargs
    public static <T> void print(T... element) {
        for (T el : element) {
            System.out.println(el);
        }
        System.out.println();
    }
}
