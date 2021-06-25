package com.company.cliente.controller;

import com.company.cliente.model.Cliente;
import com.company.cliente.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClienteController {

    final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @GetMapping
    public List<Cliente>  lista(){
        return service.listar();
    }
}
