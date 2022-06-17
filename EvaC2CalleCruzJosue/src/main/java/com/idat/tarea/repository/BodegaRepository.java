package com.idat.tarea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.idat.tarea.model.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository< Bodega, Integer>{

}
