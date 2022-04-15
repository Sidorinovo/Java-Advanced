import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] input = scan.nextLine().toCharArray();
        Map<Character, Integer> mapOfChars = new TreeMap<>();

        for (char cha :input){
            mapOfChars.putIfAbsent(cha, 0);
            mapOfChars.put(cha, mapOfChars.get(cha) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mapOfChars.entrySet()) {
            System.out.printf("%c: %d time/s\n", entry.getKey(), entry.getValue());
        }
    }
}
