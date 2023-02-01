package classwork.streams.javaNIOPackage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

    public static void main(String[] args) {
        Path path = Paths.get("src/classwork/streams/myFile.txt");
        System.out.println(path.getFileName());
        System.out.println("isDirectory::" + Files.isDirectory(path));
        System.out.println("exists::" + Files.exists(path));
    }
}
