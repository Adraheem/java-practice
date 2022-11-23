package classwork.chapter4.taxCalculator;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private String lastName;
    private BigDecimal earnings;

    public Citizen(){}

    public Citizen(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Citizen(String firstName, String lastName, BigDecimal amount){
        this(firstName, lastName);
        earnings = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }
}
