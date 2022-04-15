import java.util.*;

public class Workshop {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        SmartArray arr = new SmartArray();
        long now = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            arr.add(i);
        }

//        System.out.println(arr.contains(0));
//        System.out.println(arr.contains(9));
//        System.out.println(arr.contains(10));
//        arr.forEach(e -> System.out.print(e + " "));
//        System.out.println();
        long after = System.currentTimeMillis();
        long timeForExecution = Math.abs(now - after);
        System.out.println(timeForExecution);
    }
}
