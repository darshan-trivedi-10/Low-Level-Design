package strategydesignpattern.robot;

import strategydesignpattern.behavior.fly.FlyBehavior;
import strategydesignpattern.behavior.talk.TalkBehavior;
import strategydesignpattern.behavior.walk.WalkBehavior;
import strategydesignpattern.model.AbstractRobot;

public class CompanionRobot extends AbstractRobot {

    public CompanionRobot(WalkBehavior walk, TalkBehavior talk, FlyBehavior fly){
        super(walk, talk, fly);
    }

    @Override
    public void projection() {
        System.out.println("Projection: Companion robot");
    }
}
