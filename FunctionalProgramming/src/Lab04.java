import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UnaryOperator<Double> unary = e -> e * 1.2;
        System.out.println("Prices with VAT:");
        Arrays.stream(scan.nextLine().split(", ")).mapToDouble(e -> unary.apply(Double.parseDouble(e))).forEach(e -> System.out.printf("%.2f\n", e));
    }
}
