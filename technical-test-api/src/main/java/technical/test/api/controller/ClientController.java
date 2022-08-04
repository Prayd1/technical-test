package technical.test.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import technical.test.api.model.Client;
import technical.test.api.service.ClientRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @PostMapping("/addClient")
    public String saveClient(@RequestBody Client client){
        repository.save(client);
        return "Client "+client.getId()+" ajoute";
    }

    @GetMapping("/findAllClients")
    public List<Client> getClients(){
        return repository.findAll();
    }

    @GetMapping("/findAllClients/{id}")
    public Optional<Client> getClient(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClient(@PathVariable int id){
        repository.deleteById(id);
        return "Client "+id+" supprime";
    }
}
