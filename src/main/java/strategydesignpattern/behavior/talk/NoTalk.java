package strategydesignpattern.behavior.talk;

public class NoTalk implements TalkBehavior{
    @Override
    public void talk(){
        System.out.println("No Talk");
    }
}
