package Exercise07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T>{
    private final List<T> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }

    public void add(T element) {
        this.data.add(element);
    }

    public T remove(int index) {
        return this.data.remove(index);
    }

    public boolean contains(T element) {
        return this.data.contains(element);
    }

    public void swap(int first, int second) {
        T elementOne = this.data.get(first);
        T elementTwo = this.data.get(second);
        this.data.set(first, elementTwo);
        this.data.set(second, elementOne);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T datum : this.data) {
            if (datum.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        T max = this.data.get(0);
        for (T datum : this.data) {
            if (datum.compareTo(max) > 0) {
                max = datum;
            }
        }
        return max;
    }

    public T getMin() {
        T min = this.data.get(0);
        for (T datum : this.data) {
            if (datum.compareTo(min) < 0) {
                min = datum;
            }
        }
        return min;
    }

    @Override
    public Iterator<T> iterator() {
        return this.data.iterator();
    }
}