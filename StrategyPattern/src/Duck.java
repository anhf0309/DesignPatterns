import fly.FlyBehavior;
import quack.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck(){

    }

    void display() {
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void swim() {
        System.out.println("I'm swimming");
    }

    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
