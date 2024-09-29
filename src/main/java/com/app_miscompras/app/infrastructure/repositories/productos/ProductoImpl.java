package com.app_miscompras.app.infrastructure.repositories.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app_miscompras.app.application.services.ProductoService;
import com.app_miscompras.app.domain.entities.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class ProductoImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Producto delete(Long id) {
        Producto producto = productoRepository.findById(id).orElse(null);
        if (producto != null) {
            productoRepository.delete(producto);
            return producto;

        }
        return null;
    }

    @Transactional
    @Override
    public Producto update(Long id, Producto producto) {

        Producto newproducto = productoRepository.findById(id).orElse(null);
        if (newproducto != null) {
            newproducto.setNombre(producto.getNombre());
            newproducto.setCantidad_stock(producto.getCantidad_stock());
            newproducto.setCodigo_barras(producto.getCodigo_barras());
            newproducto.setCategoria(producto.getCategoria());
            newproducto.setPrecio_venta(producto.getPrecio_venta());
            return productoRepository.save(newproducto);

        }
        return null;
    }

    @Transactional
    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);

    }

}
