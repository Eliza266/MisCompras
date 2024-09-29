package com.app_miscompras.app.infrastructure.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app_miscompras.app.application.services.ClienteService;
import com.app_miscompras.app.domain.entities.Cliente;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> List() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable String id) {
        Cliente cliente = clienteService.findById(id);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);

        }
        return null;

    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Cliente cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.delete(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody Cliente cliente) {
        Cliente newCliente = clienteService.update(id, cliente);
        if (newCliente != null) {
            return ResponseEntity.ok(newCliente);

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }

}
