package com.Producto2.alquiler;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//public interface AlquilerRepositorio extends CrudRepository <Alquiler, Integer> {
public interface AlquilerRepositorio extends JpaRepository<Alquiler, Integer> {
}
