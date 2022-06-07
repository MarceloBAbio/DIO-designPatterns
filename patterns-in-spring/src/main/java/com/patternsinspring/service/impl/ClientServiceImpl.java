package com.patternsinspring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patternsinspring.model.Adress;
import com.patternsinspring.model.AdressRepository;
import com.patternsinspring.model.Client;
import com.patternsinspring.model.ClientRepository;
import com.patternsinspring.service.ClientService;
import com.patternsinspring.service.ViaCepService;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AdressRepository adressRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> searchAll() {

        return clientRepository.findAll();
    }

    @Override
    public Client searchById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.get();
    }

    @Override
    public void insert(Client client) {
        saveClientWithCep(client);

    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientDB = clientRepository.findById(id);
        if (clientDB.isPresent()) {
            saveClientWithCep(client);
        }

    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);

    }

    private void saveClientWithCep(Client client) {
        String cep = client.getAdress().getCep();
        Adress adress = adressRepository.findById(cep).orElseGet(() -> {
            Adress newAdress = viaCepService.searchCep(cep);
            adressRepository.save(newAdress);
            return newAdress;
        });
        client.setAdress(adress);
        clientRepository.save(client);
    }

}
