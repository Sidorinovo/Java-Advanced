import java.util.Arrays;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int diagDiff = diagonalDifference(matrix);

        System.out.println(diagDiff);
    }

    public static int diagonalDifference(int[][] matrix) {
        int sum = 0;
        int rows = 0;
        int cols = 0;

        while (rows < matrix.length) {
            sum += matrix[rows][cols];
            rows++;
            cols++;
        }

        rows = matrix.length - 1;
        cols = 0;

        while (rows >= 0){
            sum -= matrix[rows][cols];
            rows--;
            cols++;
        }

        return Math.abs(sum);
    }
}
