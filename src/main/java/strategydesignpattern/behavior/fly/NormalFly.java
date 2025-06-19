package strategydesignpattern.behavior.fly;

public class NormalFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Normal Fly");
    }
}
