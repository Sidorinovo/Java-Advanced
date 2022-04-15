package Lab01;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    private void setTitle(String title){
        this.title = title;
    }

    private void setYear(int year){
        this.year = year;
    }

    private void setAuthors(String[] authors){
        this.authors = Arrays.asList(authors);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public Book(String title, int year, String... authors){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    @Override
    public String toString() {
        return "Book with " +
                "title " + title +
                ", year " + year +
                ", authors " + authors.toString().replaceAll("[\\[\\]]", "");
    }

    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
