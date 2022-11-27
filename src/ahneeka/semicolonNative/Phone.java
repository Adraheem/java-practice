package ahneeka.semicolonNative;

public class Phone {
    private String brand;
    private String model;
    private double screenSize;
    private ChargerType chargerType;

    public Phone(String brand, String model, double screenSize, ChargerType chargerType){
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.chargerType = chargerType;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s", this.brand,this.model,this.screenSize,this.chargerType);
    }
}
