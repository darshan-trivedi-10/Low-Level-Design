package googledocs.persistence;

public class FileStorage implements Persistence{
    @Override
    public void save(String data){
        System.out.println("data saved into file :: " + data);
    }
}
