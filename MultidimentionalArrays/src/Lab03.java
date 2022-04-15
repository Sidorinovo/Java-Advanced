import java.util.Arrays;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        char[][] first = new char[rows][cols];
        char[][] second = new char[rows][cols];

        first = populate(first, scan);
        second = populate(second, scan);

        result(first, second);
    }

    public static char[][] populate(char[][] matrix, Scanner scan) {

        for (int i = 0; i < matrix.length; i++) {
            int[] cols = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> (int) e.charAt(0)).toArray();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (char) cols[j];
            }
        }

        return matrix;
    }

    public static void result(char[][] first, char[][] second) {
        char[][] resultMatrix = new char[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                if (first[i][j] == second[i][j]) {
                    resultMatrix[i][j] = first[i][j];
                } else {
                    resultMatrix[i][j] = '*';
                }
            }
        }

        printMatrix(resultMatrix);
    }

    public static void printMatrix(char[][] resultMatrix) {
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
