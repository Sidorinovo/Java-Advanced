import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = size[0];
        int cols = size[1];

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                StringBuilder matrixElement = new StringBuilder();
                char firstAndThird = (char) (97 + i);
                char second = (char) (97 + i + j);
                matrixElement.append(firstAndThird);
                matrixElement.append(second);
                matrixElement.append(firstAndThird);
                matrix[i][j] = matrixElement.toString();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
