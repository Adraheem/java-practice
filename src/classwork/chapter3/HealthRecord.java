package classwork.chapter3;

import java.time.LocalDate;

public class HealthRecord {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int dobDay;
    private int dobMonth;
    private int dobYear;
    private LocalDate dob;
    private double height;
    private double weight;
    private int age;
    private int maximumHeartRate;

    // CONSTRUCTOR
    public HealthRecord(String firstName, String lastName, Gender gender, int dobDay, int dobMonth, int dobYear, double height, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dobDay = dobDay;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
        this.height = height;
        this.weight = weight;
        this.dob = LocalDate.of(dobYear, dobMonth, dobDay);

        generateDateOfBirth();
    }

    // GETTERS AND SETTERS ---------------------------------------------

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getDobDay() {
        return dobDay;
    }

    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
        generateDateOfBirth();
    }

    public int getDobMonth() {
        return dobMonth;
    }

    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
        generateDateOfBirth();
    }

    public int getDobYear() {
        return dobYear;
    }

    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
        generateDateOfBirth();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // GETTERS AND SETTERS END --------------------------------

    private void generateDateOfBirth(){
        this.dob = LocalDate.of(this.dobYear, this.dobMonth, this.dobDay);
        LocalDate today = LocalDate.now();

        long todayEpoch = today.toEpochDay();
        long dobEpoch = this.dob.toEpochDay();

        this.age = (int) (todayEpoch - dobEpoch) / 365;
        this.maximumHeartRate = 220 - this.age;
    }

    public int getAge(){
        return age;
    }

    public int getMaximumHeartRate(){
        return maximumHeartRate;
    }

    public String getTargetHeartRateRange(){
        return (0.5 * maximumHeartRate) + " - " + (0.85 * maximumHeartRate);
    }

    public double getBMI(){
        return weight / (height * height);
    }

}
