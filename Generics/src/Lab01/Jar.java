package Lab01;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<Type> {

    private Deque<Type> content;

    public Jar() {
        this.content = new ArrayDeque<>();
    }

    public void add(Type element) {
        this.content.push(element);
    }

    public Type remove() {
        return this.content.pop();
    }
}
