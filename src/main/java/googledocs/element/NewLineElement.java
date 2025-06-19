package googledocs.element;

public class NewLineElement implements DocumentElement{
    @Override
    public String render(){
        return "\n";
    }
}
