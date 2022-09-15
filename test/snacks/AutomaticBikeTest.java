package snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {

    @Test
    public void turnOnBikeTest(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn(true);
        assertTrue(bike.isOn());
    }

    @Test
    public  void turnOffBikeTest(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn(false);
        assertFalse(bike.isOn());
    }

    @Test
    public void accelerateGearOne(){
        // I have an auto bike (Precondition)
        AutomaticBike bike = new AutomaticBike();
        // The bike is ON (Precondition)
        bike.turnOn(true);
        // The speed is at 15 km/hr (Precondition)
        bike.setSpeed(15);
        // When I accelerate
        bike.accelerate();
        // The speed is at 16 km/hr
        assertEquals(16, bike.getSpeed());
    }

    @Test
    public void accelerateGearTwo(){
        // I have an auto bike (Precondition)
        AutomaticBike bike = new AutomaticBike();
        // The bike is ON (Precondition)
        bike.turnOn(true);
        // The speed is at 24 km/hr (Precondition)
        bike.setSpeed(24);
        // When I accelerate
        bike.accelerate();
        // The speed is at 26 km/hr
        assertEquals(26, bike.getSpeed());
    }

    @Test
    public void accelerateGearThree(){
        // I have an auto bike (Precondition)
        AutomaticBike bike = new AutomaticBike();
        // The bike is ON (Precondition)
        bike.turnOn(true);
        // The speed is at 35 km/hr (Precondition)
        bike.setSpeed(35);
        // When I accelerate
        bike.accelerate();
        // The speed is at 38 km/hr
        assertEquals(38, bike.getSpeed());
    }

    @Test
    public void accelerateGearFour(){
        // I have an auto bike (Precondition)
        AutomaticBike bike = new AutomaticBike();
        // The bike is ON (Precondition)
        bike.turnOn(true);
        // The speed is at 44 km/hr (Precondition)
        bike.setSpeed(44);
        // When I accelerate
        bike.accelerate();
        // The speed is at 48 km/hr
        assertEquals(48, bike.getSpeed());
    }

    @Test
    public void decelerateGearOne(){
        // I have an auto bike (Precondition)
        AutomaticBike bike = new AutomaticBike();
        // The bike is ON (Precondition)
        bike.turnOn(true);
        // The speed is at 15 km/hr (Precondition)
        bike.setSpeed(15);
        // When I decelerate
        bike.decelerate();
        // The speed is at 14 km/hr
        assertEquals(14, bike.getSpeed());
    }

    @Test
    public void decelerateGearTwo(){
        // I have an auto bike (Precondition)
        AutomaticBike bike = new AutomaticBike();
        // The bike is ON (Precondition)
        bike.turnOn(true);
        // The speed is at 15 km/hr (Precondition)
        bike.setSpeed(24);
        // When I decelerate
        bike.decelerate();
        // The speed is at 12 km/hr
        assertEquals(22, bike.getSpeed());
    }

    @Test
    public void decelerateGearThree(){
        // I have an auto bike (Precondition)
        AutomaticBike bike = new AutomaticBike();
        // The bike is ON (Precondition)
        bike.turnOn(true);
        // The speed is at 15 km/hr (Precondition)
        bike.setSpeed(35);
        // When I decelerate
        bike.decelerate();
        // The speed is at 32 km/hr
        assertEquals(32, bike.getSpeed());
    }

    @Test
    public void decelerateGearFour(){
        // I have an auto bike (Precondition)
        AutomaticBike bike = new AutomaticBike();
        // The bike is ON (Precondition)
        bike.turnOn(true);
        // The speed is at 15 km/hr (Precondition)
        bike.setSpeed(44);
        // When I decelerate
        bike.decelerate();
        // The speed is at 40 km/hr
        assertEquals(40, bike.getSpeed());
    }

}