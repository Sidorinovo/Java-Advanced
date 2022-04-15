import java.io.FileInputStream;
import java.io.IOException;

public class Lab01 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\SoftUni\\JAVA\\02 ADVANCED\\04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (FileInputStream inputStream = new FileInputStream(path)) {
            int oneByte = inputStream.read();
            while (oneByte != -1){
                System.out.printf("%s ", (oneByte));
                oneByte = inputStream.read();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
