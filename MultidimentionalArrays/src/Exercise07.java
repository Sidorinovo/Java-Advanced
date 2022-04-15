import java.util.Arrays;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] matrixDimensions = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = matrixDimensions[0];
        int cols = matrixDimensions[1];
        int[][] matrix = new int[rows][cols];

        int num = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (j + 1) + (num * i);
                if (j == cols - 1) {
                    num = cols;
                }
            }
        }

        String explosionDetails = scan.nextLine();

        while (!"Nuke it from orbit".equals(explosionDetails)) {
            int explosionRow = Arrays.stream(explosionDetails.split(" ")).mapToInt(Integer::parseInt).toArray()[0];
            int explosionCol = Arrays.stream(explosionDetails.split(" ")).mapToInt(Integer::parseInt).toArray()[1];
            int explosionRadius = Arrays.stream(explosionDetails.split(" ")).mapToInt(Integer::parseInt).toArray()[2];
            if (explosionCol < 0 || explosionRow < 0) {
                explosionDetails = scan.nextLine();
                continue;
            }
            for (int i = explosionRow; i < rows && i < explosionRow + explosionRadius; i++) {
                matrix[i][explosionCol] = 0;
            }
            for (int i = explosionRow; i >= 0 && i >= explosionRow - explosionRadius; i--) {
                matrix[i][explosionCol] = 0;
            }
            for (int i = explosionCol; i < cols && i < explosionCol + explosionRadius; i++) {
                matrix[explosionRow][i] = 0;
            }
            for (int i = explosionCol; i >= 0 && i >= explosionCol - explosionRadius; i--) {
                matrix[explosionRow][i] = 0;
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = 0;
                    }
                }
            }
            explosionDetails = scan.nextLine();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    break;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
