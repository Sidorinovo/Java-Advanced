import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < num; i++) {
            String name = scan.nextLine();
            double[] grades = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            BigDecimal sum = new BigDecimal("0");
            for (int j = 0; j < grades.length; j++) {
                sum = sum.add(BigDecimal.valueOf(grades[i]));
            }
            BigDecimal averageGrade = sum.divide(BigDecimal.valueOf(grades.length));


            System.out.println(name + " is graduated with " +  averageGrade.toPlainString());
        }
    }
}
