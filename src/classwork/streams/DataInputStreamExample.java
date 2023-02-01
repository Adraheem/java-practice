package classwork.streams;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {

    public static void main(String[] args) {
        byte[] bytes = new byte[50];

        try {
            var dis = new DataInputStream(System.in);

            int numberOfBytesRead = dis.read(bytes);

            System.out.println("numberOfBytesRead:: " + numberOfBytesRead);

            for (byte b : bytes) {
                if (b != 0) System.out.print(Character.toString(b));
            }

            System.out.println("\033[0;35m" + "Hello there!");

            dis.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
