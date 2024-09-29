
package com.app_miscompras.app.application.services;

import java.util.List;

import com.app_miscompras.app.domain.entities.Categoria;

public interface CategoriaService {

    List<Categoria> findAll();

    Categoria findById(Long id);

    Categoria save(Categoria categoria);

    Categoria update(Long id, Categoria categoria);

    Categoria delete(Long id);
}
