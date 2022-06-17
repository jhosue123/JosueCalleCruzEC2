package com.idat.tarea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.tarea.model.Producto;



@Repository
public interface ProductoRepositorio extends JpaRepository< Producto, Integer>{


}
