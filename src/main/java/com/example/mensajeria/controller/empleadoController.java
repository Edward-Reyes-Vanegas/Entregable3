package com.example.mensajeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class empleadoController {

    @RestController
    @RequestMapping("/api/v1/empleados")
    public class empleadoController {

        private empleadoService empleadoService;

        @Autowired
        public empleadoController(empleadoService empleadoService) {

            this.empleadoService = empleadoService;
        }

        @PostMapping
        public Empleado crearEmpleado(@RequestBody Empleado empleado) {

            return empleado;
        }

        @PutMapping
        public Empleado actualizarEmpleado(@RequestBody Empleado empleado) {
            return empleado;
        }

        @DeleteMapping
        public String eliminarEmpleado(@RequestBody Empleado empleado) {
            String mensaje;

            return mensaje;
        }

        @GetMapping
        public Empleado obtenerCliente(@RequestBody Empleado empleado) {

            return empleado;
        }


    }

}
