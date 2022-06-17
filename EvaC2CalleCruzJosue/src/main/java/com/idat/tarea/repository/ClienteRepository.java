package com.idat.tarea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.tarea.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository< Cliente, Integer>{


}
