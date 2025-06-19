package strategydesignpattern.behavior.walk;

public class FastWalk implements WalkBehavior{
    @Override
    public void walk(){
        System.out.println("Fast Walk");
    }
}
