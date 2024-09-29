package com.app_miscompras.app.infrastructure.repositories.clientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app_miscompras.app.application.services.ClienteService;
import com.app_miscompras.app.domain.entities.Cliente;


@Service
public class ClienteImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>)clienteRepository.findAll();
    }

    @Transactional
    @Override
    public Cliente findById(String id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Cliente delete(String id) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if ( cliente != null) {
            clienteRepository.delete(cliente);
            return cliente;
        }
        return null;
    }

    @Transactional
    @Override
    public Cliente update(String id, Cliente cliente) {
        Cliente newcliente = clienteRepository.findById(id).orElse(null);
        if (newcliente != null) {
            newcliente.setNombre(cliente.getNombre());
            newcliente.setApellidos(cliente.getApellidos());
            newcliente.setCelular(cliente.getCelular());
            newcliente.setDireccion(cliente.getDireccion());
            newcliente.setCorreo_electronico(cliente.getCorreo_electronico());
            return clienteRepository.save(newcliente);

        }
        return null;

    }

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}
