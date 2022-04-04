package jottero.rocks.walterapi;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface postinterface extends MongoRepository<waltermodel,String>{
 public waltermodel findByText(String text);
 public waltermodel findByWalter(String walter);
}
