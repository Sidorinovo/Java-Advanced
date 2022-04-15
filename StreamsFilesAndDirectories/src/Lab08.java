import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Lab08 {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        List<File> files = Arrays.stream(file.listFiles()).toList();

        for (File fil : files) {
            if (fil.isDirectory()) {
                File[] current = fil.listFiles();
                for (File file1 : current) {
                    System.out.println(file1.getName());
                }
            } else {
                System.out.println(fil.getName());
            }
        }
    }
}
