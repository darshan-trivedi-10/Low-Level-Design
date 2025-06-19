package strategydesignpattern.behavior.walk;

public class NormalWalk implements WalkBehavior{
    @Override
    public void walk() {
        System.out.println("Normal Walk");
    }
}
