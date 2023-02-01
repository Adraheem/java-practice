package classwork.streams;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream stream = new FileInputStream("/Users/raheem/IdeaProjects/semicolonExercise/src/classwork/streams/myFile.txt");
            byte[] bytes = new byte[40];
            stream.read(bytes);

            for (byte b : bytes) {
                if (b != 0) System.out.print(Character.toString(b));
            }

            stream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
