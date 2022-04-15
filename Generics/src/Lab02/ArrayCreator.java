package Lab02;

import java.lang.reflect.Array;

public class ArrayCreator<T> {

    public static <T> T[] create(int length, T element) {
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = element;
        }
        return array;

    }

    public static <T> T[] create(Class<T> clazz, int length, T item) {
        T[] array = (T[]) Array.newInstance(clazz, length);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }

}
