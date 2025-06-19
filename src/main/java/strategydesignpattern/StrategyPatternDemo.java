package strategydesignpattern;

import strategydesignpattern.behavior.fly.JetFly;
import strategydesignpattern.behavior.fly.NormalFly;
import strategydesignpattern.behavior.talk.NoTalk;
import strategydesignpattern.behavior.talk.NormalTalk;
import strategydesignpattern.behavior.walk.FastWalk;
import strategydesignpattern.behavior.walk.NormalWalk;
import strategydesignpattern.model.Robot;
import strategydesignpattern.robot.CompanionRobot;
import strategydesignpattern.robot.WorkerRobot;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Robot robot1 = new CompanionRobot(
                new NormalWalk(),
                new NoTalk(),
                new NormalFly()
        );

        robot1.walk();
        robot1.talk();
        robot1.fly();
        robot1.projection();

        Robot robot2 = new WorkerRobot(
                new FastWalk(),
                new NormalTalk(),
                new JetFly()
        );

        robot2.walk();
        robot2.talk();
        robot2.fly();
        robot2.projection();
    }
}
