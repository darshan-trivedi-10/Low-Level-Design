package strategydesignpattern.behavior.talk;

public class NormalTalk implements TalkBehavior{
    @Override
    public void talk() {
        System.out.println("Normal Talk");
    }
}
