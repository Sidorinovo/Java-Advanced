import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String matrixDimensions = scan.nextLine();
        int rows = Arrays.stream(matrixDimensions.split(" ")).mapToInt(Integer::parseInt).toArray()[0];
        int cols = Arrays.stream(matrixDimensions.split(" ")).mapToInt(Integer::parseInt).toArray()[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int sum = 0;
        int[][] resultMatrix = new int[3][3];

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                                 matrix[i +1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
                                 matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if(currentSum > sum){
                    sum = currentSum;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            resultMatrix[k][l] = matrix[i + k][j + l];
                        }
                    }
                }
            }
        }

        System.out.printf("Sum = %d\n", sum);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
