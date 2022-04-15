import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        File file = new File("D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        List<File> files = Arrays.stream(file.listFiles()).toList();
        for (File fil : files) {
            if (fil.isFile()) {
                System.out.print(fil.getName() + ": ");
                System.out.println("["+fil.length()+"]");
            }
        }
    }
}
