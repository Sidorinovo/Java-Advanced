import java.util.Arrays;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] matrixOneDimensions = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int mOneRows = matrixOneDimensions[0];
        int mOneCols = matrixOneDimensions[1];
        int[][] matrixOne = populateMatrix(mOneRows, mOneCols, scan);

        int[] matrixTwoDimensions = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int mTwoRows = matrixTwoDimensions[0];
        int mTwoCols = matrixTwoDimensions[1];
        int[][] matrixTwo = populateMatrix(mTwoRows, mTwoCols, scan);

        if(compareMatrices(matrixOne, matrixTwo)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static int[][] populateMatrix(int rows, int cols, Scanner scan){
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] col = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < col.length; j++) {
                matrix[i][j] = col[j];
            }
        }
        return matrix;
    }

    public static boolean compareMatrices(int[][] matrixOne, int[][] matrixTwo){
        if(!compareSize(matrixOne, matrixTwo)){
            return false;
        }

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                if(matrixOne[i][j] != matrixTwo[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean compareSize(int[][] matrixOne, int[][] matrixTwo){
        if(matrixOne.length != matrixTwo.length){
            return false;
        } else {
            for (int i = 0; i < matrixOne.length; i++) {
                if(matrixOne[i].length != matrixTwo[i].length){
                    return false;
                }
            }
        }
        return true;
    }
}
