import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(command);
        int degrees = 0;
        if (match.find()) {
            degrees = Integer.parseInt(match.group());
        }
        String input = scan.nextLine();
        List<String> listOfWords = new ArrayList<>();

        while (!"END".equals(input)) {
            listOfWords.add(input);
            input = scan.nextLine();
        }

        int matrixCols = 0;
        for (String word : listOfWords) {
            if (word.length() > matrixCols) {
                matrixCols = word.length();
            }
        }

        char[][] matrix = new char[listOfWords.size()][matrixCols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrixCols; j++) {
                matrix[i][j] = ' ';
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < listOfWords.get(i).length(); j++) {
                matrix[i][j] = listOfWords.get(i).charAt(j);
            }
        }

        printRotatedMatrix(matrix, degrees);
    }

    public static void printRotatedMatrix(char[][] matrix, int degrees) {
        int rotations = degrees / 90;
        if (rotations > 4) {
            rotations %= 4;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        switch (rotations) {
            case 0:
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 1:
                for (int i = 0; i < cols; i++) {
                    for (int j = rows - 1; j >= 0; j--) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = rows - 1; i >= 0; i--) {
                    for (int j = cols - 1; j >= 0; j--) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = cols - 1; i >= 0; i--) {
                    for (int j = 0; j < rows; j++) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
