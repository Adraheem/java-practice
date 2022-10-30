package ahneeka.account;

public class Account {
    private String name;
    private double balance;
    private int age;

    public Account(){
        this.name = "No name";
        this.balance = 1.00;
        this.age = 1;
    }

    public Account(String name){
        this.name = name;
        this.balance = 2.00;
        this.age = 18;
    }

    public Account(String name, double balance, int age){
        this.name = name;
        this.balance = balance;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public int getAge(){
        return age;
    }
}
