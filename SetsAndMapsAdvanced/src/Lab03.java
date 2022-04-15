import java.util.*;
import java.util.stream.Collectors;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> playerOne = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> playerTwo = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int counter = 1;

        while (counter <= 50) {
            int biggestOne = playerOne.iterator().next();
            playerOne.remove(biggestOne);

            int biggestTwo = playerTwo.iterator().next();
            playerTwo.remove(biggestTwo);

            if (biggestOne > biggestTwo) {
                playerOne.add(biggestOne);
                playerOne.add(biggestTwo);
            } else if (biggestOne < biggestTwo){
                playerTwo.add(biggestOne);
                playerTwo.add(biggestTwo);
            }
            if(playerOne.isEmpty()){
                break;
            }
            if(playerTwo.isEmpty()){
                break;
            }
            counter++;
        }

        if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player win!");
        } else if (playerTwo.size() > playerOne.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
