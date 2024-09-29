package com.app_miscompras.app.infrastructure.repositories.categorias;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app_miscompras.app.domain.entities.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

}
