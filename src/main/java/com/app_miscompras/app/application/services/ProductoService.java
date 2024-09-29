package com.app_miscompras.app.application.services;

import java.util.List;

import com.app_miscompras.app.domain.entities.Producto;

public interface ProductoService {
    List<Producto> findAll();

    Producto findById(Long id);

    Producto delete(Long id);

    Producto update(Long id, Producto producto);

    Producto save(Producto producto);

}
