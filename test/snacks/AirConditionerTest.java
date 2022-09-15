package snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    @Test
    public void turnOnACTest(){
        // There is an AC
        AirConditioner myAC = new AirConditioner();
        // Turn on the AC
        myAC.setOn(true);
        // Check that it is ON
        assertEquals(true, myAC.getACIsOn());
    }

    @Test
    public void turnOffACTest(){
        // There is an AC
        AirConditioner myAC = new AirConditioner();
        // The AC is ON
        myAC.setOn(true);
        assertEquals(true, myAC.getACIsOn());
        // Turn off AC
        myAC.setOn(false);
        // Check that It is OFF
        assertEquals(false, myAC.getACIsOn());
    }

    @Test
    public void increaseTemperatureTest(){
        // There is an AC (Precondition)
        AirConditioner myAC = new AirConditioner();
        // The AC is ON (Precondition)
        myAC.setOn(true);
        assertEquals(true, myAC.getACIsOn());
        // The initial temperature is 0 (Precondition)
        assertEquals(0, myAC.getTemperature());
        // Increase Temperature (Action)
        myAC.increaseTemperature();
        // Check that the temperature is 1
        assertEquals(1, myAC.getTemperature());
    }

    @Test
    public void decreaseTemperatureTest(){
        // There is an AC (Precondition)
        AirConditioner myAC = new AirConditioner();
        // The AC is ON (Precondition)
        myAC.setOn(true);
        assertEquals(true, myAC.getACIsOn());
        // The initial temperature is 17 (Precondition)
        myAC.setTemperature(17);
        // Decrease Temperature (Action)
        myAC.decreaseTemperature();
        // Check that the temperature is 16
        assertEquals(16, myAC.getTemperature());
    }

    @Test
    public void maximumTemperatureTest(){
        // There is an AC (Precondition)
        AirConditioner myAC = new AirConditioner();
        // The AC is ON (Precondition)
        myAC.setOn(true);
        // Temperature is 30 (Precondition)
        myAC.setTemperature(30);
        // Increase Temperature (Action)
        myAC.increaseTemperature();
        // The temperature is still 30
        assertEquals(30, myAC.getTemperature());
    }

    @Test
    public void minimumTemperatureTest(){
        // There is an AC (Precondition)
        AirConditioner myAC = new AirConditioner();
        // The AC is ON (Precondition)
        myAC.setOn(true);
        // The temperature is 16 (Precondition)
        myAC.setTemperature(16);
        // Decrease Temperature
        myAC.decreaseTemperature();
        // The temperature is still 16
        assertEquals(16, myAC.getTemperature());
    }
}