package com.app_miscompras.app.application.services;

import java.util.List;

public interface CompraService {

    List<CompraService> findAll();

    CompraService findById(Long id);

    CompraService delete(Long id);

    CompraService update(Long id, CompraService compra);

    CompraService save(CompraService compra);
} 
