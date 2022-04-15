import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inPath = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputLab2.txt";


        try {
            FileInputStream fis = new FileInputStream(inPath);
            FileOutputStream fos = new FileOutputStream(outPath);
            int oneByte = fis.read();
            List<Character> symbols = new ArrayList<>();
            Collections.addAll(symbols, '.', ',', '!', '?');

            while (oneByte != -1) {
                if (!symbols.contains((char) oneByte)) {
                    fos.write(oneByte);
                }
                oneByte = fis.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
