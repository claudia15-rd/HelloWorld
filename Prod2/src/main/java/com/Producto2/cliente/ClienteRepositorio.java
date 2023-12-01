package com.Producto2.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
public interface ClienteRepositorio extends CrudRepository<Cliente, Integer> {
   public long countClienteByIdClientes(Integer id);


}
