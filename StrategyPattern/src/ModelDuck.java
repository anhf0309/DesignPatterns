import fly.FlyNoWay;
import quack.Quack;

public class ModelDuck extends Duck{
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("Hi, Im a model duck");
    }
}
