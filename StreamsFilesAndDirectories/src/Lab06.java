import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String path = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputLab06.txt";
        List<String> lines = Files.readAllLines(Path.of(path));
        PrintWriter pr = new PrintWriter(new FileWriter(outPath));
        Collections.sort(lines);
        for (String line : lines) {
            System.out.println(line);
            pr.write(line + '\n');
        }
        pr.close();
    }
}
