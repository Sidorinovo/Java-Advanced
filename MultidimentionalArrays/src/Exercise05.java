import java.util.Arrays;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String matrixDimensions = scan.nextLine();
        int rows = Arrays.stream(matrixDimensions.split(" ")).mapToInt(Integer::parseInt).toArray()[0];
        int cols = Arrays.stream(matrixDimensions.split(" ")).mapToInt(Integer::parseInt).toArray()[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        String[] input = scan.nextLine().split(" ");

        while(!"END".equals(input[0])){
            if(input.length != 5){
                System.out.println("Invalid input!");
                input = scan.nextLine().split(" ");
                continue;
            }
            if(!"swap".equals(input[0])){
                System.out.println("Invalid input!");
                input = scan.nextLine().split(" ");
                continue;
            }

            int rowFirst = Integer.parseInt(input[1]);
            int colFirst = Integer.parseInt(input[2]);
            int rowSecond = Integer.parseInt(input[3]);
            int colSecond = Integer.parseInt(input[4]);

            if(rowFirst >= rows || rowSecond >= rows || colFirst >= cols || colSecond >= cols){
                System.out.println("Invalid input!");
                input = scan.nextLine().split(" ");
                continue;
            }

            int firstValue = matrix[rowFirst][colFirst];
            int secondValue = matrix[rowSecond][colSecond];
            matrix[rowFirst][colFirst] = secondValue;
            matrix[rowSecond][colSecond] = firstValue;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            input = scan.nextLine().split(" ");
        }
    }
}
