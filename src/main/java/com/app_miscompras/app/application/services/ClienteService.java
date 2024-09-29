package com.app_miscompras.app.application.services;

import java.util.List;

import com.app_miscompras.app.domain.entities.Cliente;

public interface ClienteService {
    List<Cliente> findAll();

    Cliente findById( String id);

    Cliente delete(String id);

    Cliente update(String id, Cliente Cliente);

    Cliente save(Cliente Cliente);

}
