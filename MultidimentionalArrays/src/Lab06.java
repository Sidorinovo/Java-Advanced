import java.util.Arrays;
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[size][size];
        matrix = populateMatrix(matrix, scan);

        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(matrix[i][size - 1 - i] + " ");
        }
    }

    public static int[][] populateMatrix(int[][] matrix, Scanner scan) {

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }
}
