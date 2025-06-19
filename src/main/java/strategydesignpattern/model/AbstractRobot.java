package strategydesignpattern.model;

import strategydesignpattern.behavior.fly.FlyBehavior;
import strategydesignpattern.behavior.talk.TalkBehavior;
import strategydesignpattern.behavior.walk.WalkBehavior;

public abstract class AbstractRobot implements Robot{
    private final WalkBehavior walkBehavior;
    private final TalkBehavior talkBehavior;
    private final FlyBehavior flyBehavior;

    public AbstractRobot(WalkBehavior walkBehavior, TalkBehavior talkBehavior, FlyBehavior flyBehavior){
        this.walkBehavior = walkBehavior;
        this.talkBehavior = talkBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void talk(){
        talkBehavior.talk();
    }

    @Override
    public void walk() {
        walkBehavior.walk();
    }

    @Override
    public abstract void projection();
}
