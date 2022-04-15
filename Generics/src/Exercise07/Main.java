package Exercise07;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Sido";

        CustomList<Person> list = new CustomList<>();
        list.add(new Person("Sido", 40));
        list.add(new Person("Simo", 39));
        list.add(new Person("Sedo", 47));
        Person removed = list.remove(1);
        System.out.println(list.contains(removed));
        System.out.println();
    }
}
