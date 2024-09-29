package com.app_miscompras.app.infrastructure.repositories.compras;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app_miscompras.app.domain.entities.Compra;

@Repository
public interface CompraRepository  extends CrudRepository< Compra, Long >{

    
} 