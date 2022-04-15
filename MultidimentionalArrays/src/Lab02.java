import java.util.Arrays;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] matrixDimensions = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[matrixDimensions[0]][matrixDimensions[1]];

        for (int i = 0; i < matrixDimensions[0]; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int numberToBeFound = Integer.parseInt(scan.nextLine());
        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == numberToBeFound){
                    System.out.println(i + " " + j);
                    isFound = true;
                }
            }
        }

        if(!isFound){
            System.out.println("not found");
        }
    }
}
