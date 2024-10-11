package Java11;

import java.nio.file.Path;

public class PathOfMethod {
    public static void main(String[] args) {
        // Creating a Path using Path.of()
        Path path = Path.of("example", "path", "file.txt");

        // Creating a Path using Paths.get() for comparison
        Path oldPath = Path.of("example/path/file.txt");

        System.out.println("Path using Path.of(): " + path);
        System.out.println("Path using Paths.get(): " + oldPath);
    }
}
