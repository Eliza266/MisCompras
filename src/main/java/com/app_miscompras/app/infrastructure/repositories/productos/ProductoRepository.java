package com.app_miscompras.app.infrastructure.repositories.productos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app_miscompras.app.domain.entities.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{



}