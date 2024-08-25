package max.com.sa.service;


import java.util.List;
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
        this.clientRepository.save(client);
    }

    public List<Client> getAllClient() {
        return this.clientRepository.findAll();
    }
}
