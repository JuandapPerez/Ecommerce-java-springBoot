package com.proyectoSpringMvc.ecommerce.service;

import com.proyectoSpringMvc.ecommerce.model.Producto;

import java.util.Optional;

public interface ProductoService {
    public Producto save(Producto producto);
    public Optional<Producto> get(Integer id);
    public void Update(Producto producto);
    public void delete(Integer id);
}
