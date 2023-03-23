package com.example.mensajeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/paquetes")

public class paqueteController {

    private paqueteService paqueteService;

    @Autowired
    public paqueteController(paqueteService paqueteService) {

        this.paqueteService = paqueteService;
    }

    @PostMapping
    public Paquete> crearPaquete(@RequestBody Paquete paquete) {

        return paquete;
    }

    @@PutMapping
    public Paquete actualizarPaquete(@RequestBody Paquete paquete) {

        return paquete;
    }

    @DeleteMapping
    public String eliminarPaquete(@RequestBody Paquete paquete) {

        String mensaje;
        return mensaje;
    }

    @GetMapping
    public Paquete Paquete obtenerPaquete(@RequestBody Paquete paquete) {

        return paquete;
    }
}
