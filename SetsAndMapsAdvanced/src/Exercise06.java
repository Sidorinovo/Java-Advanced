import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while(!"stop".equals(command)){
            int quantity = Integer.parseInt(scan.nextLine());
            resources.putIfAbsent(command, 0);
            resources.put(command, resources.get(command) + quantity);
            command = scan.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
