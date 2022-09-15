package snacks;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void setOn(boolean value) {
        isOn = value;
    }

    public boolean getACIsOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature = temperature + 1;
        }
    }

    public void decreaseTemperature() {
        if (temperature > 16){
            temperature = temperature - 1;
        }
    }

    public void setTemperature(int degree) {
        temperature = degree;
    }
}
