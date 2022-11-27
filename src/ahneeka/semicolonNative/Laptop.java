package ahneeka.semicolonNative;

public class Laptop {
    private String model;
    private String brand;

    public Laptop(String model, String brand){
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString(){
        return String.format("%s %s", this.brand, this.model);
    }


}
