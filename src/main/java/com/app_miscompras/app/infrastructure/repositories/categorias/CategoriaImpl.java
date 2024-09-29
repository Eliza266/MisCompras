package com.app_miscompras.app.infrastructure.repositories.categorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app_miscompras.app.application.services.CategoriaService;
import com.app_miscompras.app.domain.entities.Categoria;

@Service
public class CategoriaImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);

    }

    @Transactional
    @Override
    public Categoria update(Long id, Categoria categoria) {
        Categoria newCategoria = categoriaRepository.findById(id).orElse(null);
        if (newCategoria != null) {
            newCategoria.setDescripcion(categoria.getDescripcion());
            newCategoria.setEstado(categoria.getEstado());
            return categoriaRepository.save(newCategoria);
        }
        return null;
    }

    @Override
    public Categoria delete(Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        if (categoria != null) {
            categoriaRepository.delete(categoria);
            return categoria;
        }
        return null;

    }

}
