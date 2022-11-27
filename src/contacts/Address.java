package contacts;

public class Address {
    private String streetName;
    private String city;
    private String country;

    public Address(String streetName, String city, String country) {
        this.streetName = streetName;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", streetName, city, country);
    }
}
