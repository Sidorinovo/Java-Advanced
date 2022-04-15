import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Predicate<String> startsWithCapital = e -> Character.isUpperCase(e.charAt(0));
        String[] words = scan.nextLine().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if(!startsWithCapital.test(words[i])){
                words[i] = null;
            }
        }

        Predicate<String> isNotNull = e -> e != null;
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if(isNotNull.test(words[i])){
                count++;
            }
        }

        System.out.println(count);
        for (String word : words) {
            if(isNotNull.test(word)){
                System.out.println(word);
            }
        }

    }
}
