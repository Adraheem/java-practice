package aliyah;

import java.util.Arrays;

public class NativeDriver {
    public static void main(String[] args) {
        Native renike = new Native();
        System.out.println(renike.getName());

        renike.setName("Aliyah Renike");

        System.out.println(renike.getName());
    }
}
