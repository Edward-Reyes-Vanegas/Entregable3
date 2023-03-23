package com.example.mensajeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/envios")

public class envioController {

        private envioService envioService;

        @Autowired
        public envioController(envioService envioService) {

            this.envioService = envioService;
        }

        @PostMapping
        public Envio crearEnvio(@RequestBody Envio envio) {

            return envio;
        }

        @PutMapping
        public Envio actualizarEnvio(@RequestBody Envio envio) {

            return envio;
        }

        @DeleteMapping
        public String eliminarEnvio(@RequestBody Envio envio) {
            String mensaje;

            return mensaje;
        }

        @GetMapping
        public Envio obtenerEnvio(@RequestBody Envio envio) {

            return envio;
        }

}
