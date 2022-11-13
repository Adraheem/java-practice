package duck;

public class Duck {
    private Flyable fly;
    private Quackable quack;

    public Duck(Flyable fly, Quackable quack) {
        this.fly = fly;
        this.quack = quack;
    }

    public void quack() {
        quack.quack();
    }

    public void fly() {
        fly.fly();
    }
}
