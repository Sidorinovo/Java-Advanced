import com.sun.source.tree.Tree;

import java.util.*;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> vipList = new TreeSet<>();
        Set<String> regularList = new TreeSet<>();

        String input = scan.nextLine();

        while(!"PARTY".equals(input)){

            if(Character.isDigit(input.charAt(0)) && input.length() == 8){
                vipList.add(input);
            } else if(Character.isLetter(input.charAt(0)) && input.length() == 8) {
                regularList.add(input);
            }

            input = scan.nextLine();
        }

        input = scan.nextLine();

        while(!"END".equals(input)){

            if(Character.isDigit(input.charAt(0)) && input.length() == 8){
                vipList.remove(input);
            } else if(Character.isLetter(input.charAt(0)) && input.length() == 8) {
                regularList.remove(input);
            }

            input = scan.nextLine();
        }

        System.out.println(vipList.size() + regularList.size());

        for (String vip : vipList) {
            System.out.println(vip);
        }

        for (String regular : regularList) {
            System.out.println(regular);
        }
    }
}
