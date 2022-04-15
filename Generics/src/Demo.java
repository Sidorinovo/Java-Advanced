import java.lang.reflect.Array;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] numbers = Demo.create(12, 0);

        String[] strings = create(12, "String");

        System.out.println();
    }

    public static <T> T[] create(int length, T element) {
        Object arr = Array.newInstance(element.getClass(), length);
        T[] newArr = (T[])arr;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = element;
        }
        return newArr;
    }
}
