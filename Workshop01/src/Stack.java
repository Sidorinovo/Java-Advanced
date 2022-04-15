import java.util.function.Consumer;

public class Stack {
    private static class Node {
        private final int element;
        private Node previous;

        private Node(int element) {
            this.element = element;
        }
    }

    private Node top;
    private int size;

    public Stack() {

    }

    public void push(int element) {
        Node current = new Node(element);
        if (this.top != null) {
            current.previous = this.top;
        }
        this.top = current;
        this.size++;
    }

    public int pop() {
        empty(this.top);
        int number = this.top.element;
        this.top = this.top.previous;
        this.size--;

        return number;
    }

    public int peek() {
        empty(this.top);
        return this.top.element;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void forEach(Consumer<Integer> consumer){
        Node current = this.top;
        while(current != null){
            consumer.accept(current.element);
            current = current.previous;
        }
    }

    private void empty(Node top) {
        if (top == null) {
            throw new IllegalStateException("Empty stack");
        }
    }

    public int size() {
        return this.size;
    }

    public void reset(){
        this.top = null;
        this.size = 0;
    }
}
