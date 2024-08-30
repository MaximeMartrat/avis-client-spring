package max.com.sa.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import max.com.sa.entites.Client;
import max.com.sa.repository.ClientRepository;

@Service
public class ClientService {
    
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void createClient(Client client) {
        Client clientBDD = this.clientRepository.findByEmail(client.getEmail());
        if (clientBDD == null) {
            this.clientRepository.save(client);
        }
        System.err.println("Client " + client.getEmail() + " already exists");
        
    }

    public List<Client> getAllClient() {
        return this.clientRepository.findAll();
    }

    public Client getClientById(int id) {
        Optional<Client> optionalClient = this.clientRepository.findById(id);
        return optionalClient.orElse(null);
    }
}
