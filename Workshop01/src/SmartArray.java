import java.util.Arrays;
import java.util.function.Consumer;

public class SmartArray {
    private static final int initialCapacity = 4;
    private int capacity;
    private int length;
    private int[] data;

    public SmartArray() {
        this.capacity = initialCapacity;
        this.length = 0;
        this.data = new int[initialCapacity];
    }

    public int get(int index) throws Exception {
        indexChecker(index);
        return this.data[index];
    }

    public void add(int element) {
        if (this.length == this.capacity - 1) {
            resize();
        }
        this.data[this.length++] = element;
    }

    public void add(int element, int index) throws Exception {
        indexChecker(index);
        if (this.length == this.capacity - 1) {
            resize();
        }
        this.length++;
        for (int i = this.length; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[index] = element;
    }

    public int remove(int index) throws Exception {
        int num = this.data[index];
        indexChecker(index);

        for (int i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }

        this.length--;
        this.data[this.length] = 0;

        if (this.length <= this.capacity / 4 && this.length >= 2) {
            shrink();
        }
        return num;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.length; i++) {
            consumer.accept(this.data[i]);
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.length; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    private void indexChecker(int index) throws Exception {
        if (index >= this.length || index < 0) {
            String message = String.format("Not a valid index. Index %d out of bounds for length %d", index, this.length);
            throw new IndexOutOfBoundsException(message);
        }
    }

    private void resize() {
        this.capacity *= 2;
        int[] temp = new int[this.capacity];

        for (int i = 0; i < this.data.length; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    public void shrink() {
        this.capacity /= 2;
        int[] temp = new int[this.capacity];

        for (int i = 0; i < this.capacity; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    public int getLength() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
