package Lab01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();


        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.printf("%s is before %s%n", bookOne, bookTwo);
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.printf("%s is before %s%n", bookTwo, bookOne);
        } else {
            System.out.println("Book are equal");
        }

        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort(new BookComparator());

        System.out.println();
    }
}
