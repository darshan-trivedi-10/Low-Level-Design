package googledocs.persistence;

public class DBStorage implements Persistence{
    @Override
    public void save(String data){
        System.out.println("data saved into db :: " + data);
    }
}
