package googledocs.document;

import googledocs.persistence.Persistence;

public class DocumentSaver {
    private final Persistence persistence;

    public DocumentSaver(Persistence persistence){
        this.persistence = persistence;
    }

    public void save(String data){
        persistence.save(data);
    }
}
