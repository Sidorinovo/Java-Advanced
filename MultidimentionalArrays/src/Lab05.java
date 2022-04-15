import java.util.Arrays;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];
        matrix = populateMatrix(matrix, scan);

        int[][] best = best(matrix);

        printBest(best);
        System.out.println(best[0][0]+best[0][1]+best[1][0]+best[1][1]);
    }

    public static int[][] populateMatrix(int[][] matrix, Scanner scan) {

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }

    public static int[][] best(int[][] matrix) {
        int[][] best = new int[2][2];
        int sum = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                int oneOne = matrix[i][j];
                int oneTwo = matrix[i][j + 1];
                int twoOne = matrix[i + 1][j];
                int twoTwo = matrix[i + 1][j + 1];
                if (oneOne + oneTwo + twoOne + twoTwo > sum) {
                    sum = oneOne + oneTwo + twoOne + twoTwo;
                    best[0][0] = oneOne;
                    best[0][1] = oneTwo;
                    best[1][0] = twoOne;
                    best[1][1] = twoTwo;
                }
            }
        }

        return best;
    }

    public static void printBest(int[][] best){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(best[i][j] + " ");
            }
            System.out.println();
        }
    }
}
