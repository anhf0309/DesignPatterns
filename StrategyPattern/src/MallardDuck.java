import fly.FlyWithWings;
import quack.Quack;

public class MallardDuck extends Duck{

    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Hi, I'm a mallard duck");
    }
}
