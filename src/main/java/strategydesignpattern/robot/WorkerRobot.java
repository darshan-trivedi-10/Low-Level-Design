package strategydesignpattern.robot;

import strategydesignpattern.behavior.fly.FlyBehavior;
import strategydesignpattern.behavior.fly.NormalFly;
import strategydesignpattern.behavior.talk.NormalTalk;
import strategydesignpattern.behavior.talk.TalkBehavior;
import strategydesignpattern.behavior.walk.NormalWalk;
import strategydesignpattern.behavior.walk.WalkBehavior;
import strategydesignpattern.model.AbstractRobot;

public class WorkerRobot extends AbstractRobot {
    public WorkerRobot(WalkBehavior walk, TalkBehavior talk, FlyBehavior fly){
        super(walk, talk, fly);
    }

    @Override
    public void projection() {
        System.out.println("Projection: WorkerRobot Robot");
    }
}