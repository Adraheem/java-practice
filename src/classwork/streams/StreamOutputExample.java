package classwork.streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class StreamOutputExample {

    public static void main(String[] args) {
        String name = """
                package classwork.streams;
                
                public class ClassFromStream {
                    public static void main(String[] args) {
                        System.out.println("Hello from the stream updated");
                    }
                }
                """;
        try {
            FileOutputStream stream = new FileOutputStream("/Users/raheem/IdeaProjects/semicolonExercise/src" +
                    "/classwork/streams/ClassFromStream.java");
            stream.write(name.getBytes());
            stream.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
