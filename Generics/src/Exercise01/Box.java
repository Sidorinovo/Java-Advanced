package Exercise01;

import java.util.ArrayList;
import java.util.List;

public class Box <Type> {
    public List<Type> elements;

    public Box(){
        this.elements = new ArrayList<>();
    }

    public void add(Type element){
        this.elements.add(element);
    }

    @Override
    public String toString() {
        List<String> current = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            current.add(elements.get(i).getClass().toString() + ": " + elements.get(i));
        }
        return current.toString().replaceAll("[\\[\\]]","").replaceAll(", ", "\n");
    }
}
