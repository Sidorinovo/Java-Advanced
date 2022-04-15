import java.util.Arrays;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] matrixDimensions = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = matrixDimensions[0];
        int cols = matrixDimensions[1];

        int[][] matrix = populateMatrix(rows, cols, scan);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum(matrix));
    }

    public static int[][] populateMatrix(int rows, int cols, Scanner scan){
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }

    public static int sum(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

}
