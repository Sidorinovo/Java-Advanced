import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] indexOfWrongValue = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int wrongValue = matrix[indexOfWrongValue[0]][indexOfWrongValue[1]];
        int[][] result = new int[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            result[i] = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[i][j];
            }
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == wrongValue){
                    if(i > 0 && matrix[i - 1][j] != wrongValue){
                        sum += matrix[i - 1][j];
                    }
                    if(i < matrix.length - 1 && matrix[i + 1][j] != wrongValue){
                        sum += matrix[i + 1][j];
                    }
                    if(j > 0 && matrix[i][j - 1] != wrongValue){
                        sum += matrix[i][j - 1];
                    }
                    if(j < matrix[i].length - 1 && matrix[i][j + 1] != wrongValue){
                        sum += matrix[i][j + 1];
                    }
                    result[i][j] = sum;
                    sum = 0;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
