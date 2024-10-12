package Java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMismatch {
    public static void main(String[] args) {
        try {
            Path file1 = Files.createTempFile("file1", ".txt");
            Path file2 = Files.createTempFile("file2", ".txt");

            Files.writeString(file1, "Java 12 Features");
            Files.writeString(file2, "Java 12 Features");

            long mismatchPosition = Files.mismatch(file1, file2);
            System.out.println("Mismatch Position: " + mismatchPosition);

            // Change file2 content
            Files.writeString(file2, "Java 12 New Features");
            mismatchPosition = Files.mismatch(file1, file2);
            System.out.println("Mismatch Position after change: " + mismatchPosition);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
