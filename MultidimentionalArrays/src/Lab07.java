import java.util.Arrays;
import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        for (int i = 0; i < 8; i++) {
            int[] cols = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> (char) e.charAt(0)).toArray();
            for (int j = 0; j < cols.length; j++) {
                matrix[i][j] = (char) cols[j];
            }
        }

        printQueenPosition(matrix);
    }

    public static void printQueenPosition(char[][] matrix) {

        int[] validPosition = new int[2];
        boolean checkRowAndCol;
        boolean checkDiagonals;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] == 'q') {
                    checkRowAndCol = checkRowAndCol(matrix, i, j);
                    checkDiagonals = checkDiagonals(matrix, i, j);
                    if (checkRowAndCol && checkDiagonals) {
                        validPosition[0] = i;
                        validPosition[1] = j;
                    }
                }
            }
        }

        System.out.println(validPosition[0] + " " + validPosition[1]);
    }

    public static boolean checkRowAndCol(char[][] matrix, int row, int col) {

        for (int i = row + 1; i < 8; i++) {
            if (matrix[i][col] == 'q') {
                return false;
            }
        }

        for (int i = row - 1; i >= 0; i--) {
            if (matrix[i][col] == 'q') {
                return false;
            }
        }

        for (int i = col + 1; i < 8; i++) {
            if (matrix[row][i] == 'q') {
                return false;
            }
        }

        for (int i = col - 1; i >= 0; i--) {
            if (matrix[row][i] == 'q') {
                return false;
            }
        }

        return true;
    }

    public static boolean checkDiagonals(char[][] matrix, int row, int col) {

        int currentRow = row;
        int currentCol = col;

        while (currentRow + 1 < 8 && currentCol + 1 < 8) {
            if (matrix[currentRow + 1][currentCol + 1] == 'q') {
                return false;
            }
            currentRow++;
            currentCol++;
        }

        currentRow = row;
        currentCol = col;

        while (currentRow - 1 >= 0 && currentCol - 1 >= 8) {
            if (matrix[currentRow - 1][currentCol - 1] == 'q') {
                return false;
            }
            currentRow--;
            currentCol--;
        }

        currentRow = row;
        currentCol = col;

        while (currentRow + 1 < 8 && currentCol - 1 >= 0) {
            if (matrix[currentRow + 1][currentCol - 1] == 'q') {
                return false;
            }
            currentRow++;
            currentCol--;
        }

        currentRow = row;
        currentCol = col;

        while (currentRow - 1 >= 0 && currentCol + 1 < 8) {
            if (matrix[currentRow - 1][currentCol + 1] == 'q') {
                return false;
            }
            currentRow--;
            currentCol++;
        }

        return true;
    }
}
