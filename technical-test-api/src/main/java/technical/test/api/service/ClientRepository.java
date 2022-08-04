package technical.test.api.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import technical.test.api.model.Client;

public interface ClientRepository extends MongoRepository<Client, Integer> {
}
