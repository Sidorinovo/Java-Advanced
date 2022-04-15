import java.io.*;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) throws FileNotFoundException {
        String inPath = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputLab4.txt";

        FileInputStream fis = new FileInputStream(inPath);
        FileOutputStream fos = new FileOutputStream(outPath);

        Scanner scan = new Scanner(fis);
        while (scan.hasNext()){
            if(scan.hasNextInt()){
                System.out.println(scan.nextInt());
            }
            scan.next();
        }
    }
}
