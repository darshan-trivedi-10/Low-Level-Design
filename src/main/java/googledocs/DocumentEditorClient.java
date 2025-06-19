package googledocs;

import googledocs.document.Document;
import googledocs.document.DocumentBuilder;
import googledocs.document.DocumentRenderer;
import googledocs.document.DocumentSaver;
import googledocs.persistence.DBStorage;
import googledocs.persistence.Persistence;

public class DocumentEditorClient {
    public static void main(String[] args) {
        Document document = new Document();
        Persistence persistence = new DBStorage();

        DocumentBuilder documentBuilder = new DocumentBuilder(document);
        DocumentRenderer documentRenderer = new DocumentRenderer(document);
        DocumentSaver documentSaver = new DocumentSaver(persistence);

        documentBuilder.addText("Hello, world!");
        documentBuilder.addNewLine();
        documentBuilder.addText("This is a document editor");
        documentBuilder.addNewLine();
        documentBuilder.addTabSpace();
        documentBuilder.addImage("Indented line");
        documentBuilder.addNewLine();
        documentBuilder.addImage("image.png");

        System.out.println(documentRenderer.render());
        documentSaver.save(documentRenderer.render());
    }
}
