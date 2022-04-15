import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab05 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String inPath = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputLab5.txt";

        BufferedReader br = new BufferedReader(new FileReader(inPath));
        PrintWriter pr = new PrintWriter(new FileWriter(outPath));

        List<String> lines = br.lines().toList();
        for (int i = 2; i < lines.size(); i += 3) {
            pr.write(lines.get(i) + '\n');
        }
        br.close();
        pr.close();
    }
}
