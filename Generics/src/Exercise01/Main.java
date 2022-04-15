package Exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Box<Integer> box = new Box<>();
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < num; i++) {
            box.add(Integer.parseInt(scan.nextLine()));
        }

        System.out.println(box);
    }
}
