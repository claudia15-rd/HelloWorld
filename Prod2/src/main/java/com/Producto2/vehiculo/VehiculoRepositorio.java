package com.Producto2.vehiculo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehiculoRepositorio extends CrudRepository <Vehiculo, Integer> {
//public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Integer> {
    public long countVehiculosByIdVehiculos(Integer id);


}
