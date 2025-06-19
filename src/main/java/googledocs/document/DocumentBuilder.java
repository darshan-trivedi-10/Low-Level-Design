package googledocs.document;

import googledocs.element.ImageElement;
import googledocs.element.NewLineElement;
import googledocs.element.TabElement;
import googledocs.element.TextElement;
import googledocs.persistence.Persistence;

public class DocumentBuilder {
    private final Document document;

    public DocumentBuilder(Document document){
        this.document = document;
    }
    public void addText(String text){
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath){
        document.addElement(new ImageElement(imagePath));
    }

    public void addNewLine(){
        document.addElement(new NewLineElement());
    }

    public void addTabSpace(){
        document.addElement(new TabElement());
    }
}
