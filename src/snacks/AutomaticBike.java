package snacks;

public class AutomaticBike {
    private boolean poweredOn;
    private int speed;
    private int gear;

    public void turnOn(boolean value) {
        poweredOn = value;
    }

    public boolean isOn() {
        return poweredOn;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        setGear();
    }

    private void setGear(){
        if (speed >= 0 && speed <= 20){
            gear = 1;
        } else if (speed >= 21 && speed <= 30){
            gear = 2;
        } else if (speed >= 31 && speed <= 40){
            gear = 3;
        } else if (speed >= 41){
            gear = 4;
        }
    }

    public void accelerate() {
        if(gear == 1) {
            speed++;
        } else if (gear == 2){
            speed += 2;
        } else if (gear == 3){
            speed += 3;
        } else if (gear == 4) {
            speed += 4;
        }
        setGear();
    }

    public void decelerate() {
        if(gear == 1) {
            speed--;
        } else if (gear == 2){
            speed -= 2;
        } else if (gear == 3){
            speed -= 3;
        } else if (gear == 4) {
            speed -= 4;
        }
        setGear();
    }

    public int getSpeed() {
        return speed;
    }
}
