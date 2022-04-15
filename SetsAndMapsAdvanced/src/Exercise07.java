import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        Map<String, String> listOfMails = new LinkedHashMap<>();

        while (!"stop".equals(name)) {
            String email = scan.nextLine();
            String domain = email.split("\\.")[1];
            if(!domain.equals("us") && (!domain.equals("uk")) &&(!domain.equals("com"))){
                listOfMails.put(name, email);
            }
            name = scan.nextLine();
        }

        for (Map.Entry<String, String> entry : listOfMails.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
