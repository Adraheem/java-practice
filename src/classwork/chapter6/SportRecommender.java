package classwork.chapter6;

public class SportRecommender {

    private final int temperature;

    public SportRecommender(int temperature) {
        this.temperature = temperature;
    }

    public String recommend() {
        if(temperature >= 20 && temperature <= 30){
            return "It’s lovely weather for sports today!";
        }
        if(temperature >= 10 && temperature <= 40){
            return "It’s reasonable weather for sports today.";
        }
        return "Please exercise with care today, watch out for the weather!";
    }
}
