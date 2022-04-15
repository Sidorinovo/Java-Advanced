package Exercises;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterator<String> {
    private List<String> data;
    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < data.size() - 1;
    }

    @Override
    public String next() {
        return data.get(index++);
    }
}
