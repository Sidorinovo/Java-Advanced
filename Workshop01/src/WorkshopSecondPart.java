import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkshopSecondPart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(Math.abs(start - end));

        start = System.currentTimeMillis();
        list.forEach(e -> {
        });
        end = System.currentTimeMillis();
        System.out.println(Math.abs(start - end));

        start = System.currentTimeMillis();
        Stack stack = new Stack();
        for (int i = 1; i <= 100000000; i++) {
            stack.push(i);
        }
        end = System.currentTimeMillis();
        System.out.println(Math.abs(start - end));
        forEachTime(stack);
        stack.reset();

        pushAndResetTest(stack);

        pushAndResetTest(stack);

        pushAndResetTest(stack);

        pushAndResetTest(stack);

        pushAndResetTest(stack);


        System.out.println();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }

    private static void forEachTime(Stack stack) {
        long end;
        long start;
        start = System.currentTimeMillis();
        stack.forEach(e -> {
        });
        end = System.currentTimeMillis();
        System.out.println(Math.abs(start - end));
    }

    private static void pushAndResetTest(Stack stack) {
        long start;
        long end;
        start = System.currentTimeMillis();
        for (int i = 1; i <= 100000000; i++) {
            stack.push(i);
        }
        end = System.currentTimeMillis();
        System.out.println(Math.abs(start - end));
        forEachTime(stack);
        stack.reset();
    }
}
