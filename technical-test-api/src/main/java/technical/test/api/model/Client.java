package technical.test.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter

@Document(collection = "Client")
public class Client {

    @Id
    private int id;
    private String clientFirstName;
    private String clientLastName;

}
