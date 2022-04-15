import java.util.*;
import java.util.stream.Collectors;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, Set<String>> playerScores = new LinkedHashMap<>();

        while (!"JOKER".equals(input)) {
            String name = input.split(":")[0];
            playerScores.putIfAbsent(name, new HashSet<>());
            Set<String> currentCardDeck = Arrays.stream(input.split(":")[1].trim().split(", ")).collect(Collectors.toCollection(HashSet::new));
            Set<String> presentDeck = playerScores.get(name);
            presentDeck.addAll(currentCardDeck);
            input = scan.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : playerScores.entrySet()) {
            System.out.printf("%s: ", entry.getKey());
            Set<String> currentDeck = entry.getValue();
            int totalSum = 0;

            for (String cardHand : currentDeck) {
                String power = cardHand.substring(0, cardHand.length() - 1);
                char multiplier = cardHand.charAt(cardHand.length() - 1);
                int sum = 0;
                switch (power) {
                    case "2":
                        sum = 2;
                        break;
                    case "3":
                        sum = 3;
                        break;
                    case "4":
                        sum = 4;
                        break;
                    case "5":
                        sum = 5;
                        break;
                    case "6":
                        sum = 6;
                        break;
                    case "7":
                        sum = 7;
                        break;
                    case "8":
                        sum = 8;
                        break;
                    case "9":
                        sum = 9;
                        break;
                    case "10":
                        sum = 10;
                        break;
                    case "J":
                        sum = 11;
                        break;
                    case "Q":
                        sum = 12;
                        break;
                    case "K":
                        sum = 13;
                        break;
                    case "A":
                        sum = 14;
                        break;
                }
                switch (multiplier) {
                    case 'S':
                        sum *= 4;
                        break;
                    case 'H':
                        sum *= 3;
                        break;
                    case 'D':
                        sum *= 2;
                        break;
                }
                totalSum += sum;
            }
            System.out.println(totalSum);
        }
    }
}
