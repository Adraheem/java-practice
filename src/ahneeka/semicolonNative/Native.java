package ahneeka.semicolonNative;

public class Native {
    private String name;
    private String id;
    private String email;
    private Cohort cohort;
    private Laptop laptop;
    private Phone phone;

    public Native(){}

    public Native(String name, String id, String email, Cohort cohort, Laptop laptop){
        this.name = name;
        this.id = id;
        this.email = email;
        this.cohort = cohort;
        this.laptop = laptop;
    }

    public Native(String name, String id, String email){
        this(name, id, email, null, null);
    }

    @Override
    public String toString() {
        return String.format("%s of id %s and email %s has %s and %s", this.name, this.id,
                this.email, this.laptop, this.phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cohort getCohort() {
        return cohort;
    }

    public void setCohort(Cohort cohort) {
        this.cohort = cohort;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
