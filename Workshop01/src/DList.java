import java.util.function.Consumer;

public class DList {
    private static class Node {
        public int element;
        public Node next;
        public Node previous;

        public Node(int element) {
            this.element = element;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (this.first == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.first.previous = newNode;
            newNode.next = this.first;
            this.first = newNode;
        }
        size++;
    }

    public void addLast(int element) {
        Node newNode = new Node(element);
        if (this.last == null) {
            this.last = newNode;
            this.first = newNode;
        } else {
            this.last.next = newNode;
            newNode.previous = this.last;
            this.last = newNode;
        }
        size++;
    }

    public int removeFirst() {
        if (this.first == null) {
            throw new IllegalStateException("List is empty.");
        }
        int element = this.first.element;
        this.first.next.previous = null;
        this.first = this.first.next;
        size--;
        return element;
    }

    public int removeLast() {
        if (this.last == null) {
            throw new IllegalStateException("List is empty.");
        }
        int element = this.last.element;
        this.last.previous.next = null;
        this.last = this.last.previous;
        size--;
        return element;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node current = this.first;
        while (current != null) {
            consumer.accept(current.element);
            current = current.next;
        }
    }

    public int get(int index) {
        if (index < 0 || index > this.size - 1) {
            throw new IndexOutOfBoundsException("Index out of bounds!!!");
        }

        Node current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.element;
    }

    public int[] toArray() {
        int[] arr = new int[this.size];
        Node current = first;
        for (int i = 0; i < size; i++) {
            arr[i] = current.element;
            current = current.next;
        }
        return arr;
    }
}
