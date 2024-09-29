package com.app_miscompras.app.infrastructure.repositories.clientes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app_miscompras.app.domain.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {

}



