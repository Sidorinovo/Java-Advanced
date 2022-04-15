import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        String path = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File root = new File(path);

        Deque<File> dirs = new ArrayDeque<>();
        int count = 0;


        File[] nestedFiles = root.listFiles();
        for (File nestedFile : nestedFiles) {
            if (nestedFile.isDirectory()) {
                System.out.println(nestedFile.getName());
                count++;
            }
            System.out.println(count + " folders");


        }
    }
}
