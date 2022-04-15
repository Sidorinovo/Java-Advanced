import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();
        String input = scan.nextLine();

        while(!"search".equals(input)){
            String name = input.split("-")[0];
            String phoneNumber = input.split("-")[1];
            phonebook.put(name, phoneNumber);

            input = scan.nextLine();
        }

        input = scan.nextLine();

        while(!"stop".equals(input)){
            if(phonebook.containsKey(input)){
                System.out.printf("%s -> %s\n", input, phonebook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }
            input = scan.nextLine();
        }
    }
}
