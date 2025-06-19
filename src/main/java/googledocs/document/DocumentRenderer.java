package googledocs.document;

public class DocumentRenderer {
    private final Document document;

    public DocumentRenderer(Document document){
        this.document = document;
    }

    public String render(){
        return document.render();
    }
}
