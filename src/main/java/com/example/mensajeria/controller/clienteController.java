package com.example.mensajeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clientes")
public class clienteController {

    private clienteService clienteService;

    @Autowired
    public clienteController(clienteService clienteService) {

        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {

        return cliente;
    }

    @PutMapping
    public Cliente actualizarCliente(@RequestBody Cliente cliente) {

        return Cliente;
    }

    @DeleteMapping
    public String eliminarCliente(@RequestBody Cliente cliente) {
        String mensaje;

        return mensaje;
    }

    @GetMapping
    public Cliente Cliente obtenerCliente(@RequestBody Cliente cliente) {

        return Cliente;
    }


}
