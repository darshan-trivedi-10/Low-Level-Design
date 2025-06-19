package googledocs.document;

import googledocs.element.DocumentElement;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentElement> elements;

    public Document(){
        elements = new ArrayList<>();
    }

    public void addElement(DocumentElement element){
        elements.add(element);
    }

    public void clear(){
        elements.clear();
    }

    public String render(){
        StringBuilder doc = new StringBuilder();
        for (DocumentElement element : elements){
            doc.append(element.render());
        }
        return doc.toString();
    }




}
