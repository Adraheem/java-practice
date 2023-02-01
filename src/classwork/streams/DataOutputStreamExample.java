package classwork.streams;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class DataOutputStreamExample {

    public static void main(String[] args) {
        try {
            /**
             * System.setIn()
             * System.setOut()
             * System.setErr()
             */
            PrintStream altOut = new PrintStream("/Users/raheem/IdeaProjects/semicolonExercise/src/classwork/streams" +
                    "/dos.txt");
            System.setOut(altOut);

            String data = "Hello world again!";
            var dos = new DataOutputStream(System.out);
            dos.write(data.getBytes());

            dos.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
