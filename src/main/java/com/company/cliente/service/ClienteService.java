package com.company.cliente.service;

import com.company.cliente.model.Cliente;
import com.company.cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {

        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente){
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }
}
