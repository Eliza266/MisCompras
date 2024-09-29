package com.app_miscompras.app.infrastructure.repositories.compras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app_miscompras.app.application.services.CompraService;

@Service
public class CompraImpl implements CompraService {
    @Autowired
    private CompraRepository compraRepository;

    @Transactional
    @Override
    public List<CompraService> findAll() {

        throw new UnsupportedOperationException("Unimplemented method 'findById'");
        // return (List<Compra>) compraRepository.findAll();
    }

    @Transactional
    @Override
    public CompraService findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Transactional
    @Override
    public CompraService delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Transactional
    @Override
    public CompraService update(Long id, CompraService compra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public CompraService save(CompraService compra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
