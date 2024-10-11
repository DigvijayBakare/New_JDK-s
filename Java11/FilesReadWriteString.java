package Java11;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesReadWriteString {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("D:\\Coding\\JAVA\\Codes\\After_Java8\\src\\Java11\\example.txt");

        // Writing a string to a file
        Files.writeString(filePath, "Java 11 Features");

        // Reading a string from a file
        String content = Files.readString(filePath);
        System.out.println("File Content: " + content);
    }
}
