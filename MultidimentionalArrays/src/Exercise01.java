import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] sizeAndVariant = scan.nextLine().split(", ");
        int size = Integer.parseInt(sizeAndVariant[0]);
        String variant = sizeAndVariant[1];

        int[][] matrix = new int[size][size];

        if ("A".equals(variant)) {
            fillVariantA(matrix);
        } else {
            fillVariantB(matrix);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillVariantA(int[][] matrix) {
        int num = 1;
        for (int cols = 0; cols < matrix.length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++) {
                matrix[rows][cols] = num;
                num++;
            }
        }
        return matrix;
    }

    public static int[][] fillVariantB(int[][] matrix) {
        int num = 1;
        for (int cols = 0; cols < matrix.length; cols++) {
            if (cols % 2 == 0) {
                for (int rows = 0; rows < matrix.length; rows++) {
                    matrix[rows][cols] = num;
                    num++;
                }
            } else {
                for (int rows = matrix.length - 1; rows >= 0; rows--) {
                    matrix[rows][cols] = num;
                    num++;
                }
            }
        }
        return matrix;
    }
}
