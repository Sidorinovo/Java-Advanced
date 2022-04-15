import java.io.*;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inPath = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputLab3.txt";

        try {
            FileInputStream fis = new FileInputStream(inPath);
            FileOutputStream fos = new FileOutputStream(outPath);
            int oneByte = fis.read();

            while (oneByte != -1) {
                if (oneByte != ' ' && oneByte != '\n') {
                    String digit = String.valueOf(oneByte);
                    for (int i = 0; i < digit.length(); i++) {
                        fos.write(digit.charAt(i));
                    }
                } else {
                    fos.write(oneByte);
                }
                oneByte = fis.read();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
