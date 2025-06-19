package strategydesignpattern.behavior.fly;

public class JetFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Jet Fly");
    }
}
