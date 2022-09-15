package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IphoneTest {

    @Test
    public void testColor(){
        Iphone iphone = new Iphone();

        iphone.setColor("Rose gold");
        assertEquals("Rose gold", iphone.getColor());
    }

    @Test
    public void testPrice(){
        Iphone.setPrice(5000.00);

        assertEquals(5000.00, Iphone.getPrice());
    }
}
