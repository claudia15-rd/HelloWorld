package com.Producto2;

import com.Producto2.alquiler.Alquiler;
import com.Producto2.alquiler.AlquilerRepositorio;
import com.Producto2.cliente.Cliente;
import com.Producto2.cliente.ClienteRepositorio;
import com.Producto2.vehiculo.Vehiculo;
import com.Producto2.vehiculo.VehiculoRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class AlquilerRepositorioTest {

    @Autowired
    private AlquilerRepositorio repo;
    @Autowired
    private ClienteRepositorio repo2;
    @Autowired
    private VehiculoRepositorio repo3;


    @Test
    public void testEncontrarVehiculoyCliente(){


        Vehiculo vehi= repo3.findById(4).get();
        Cliente clie=repo2.findById(6).get();

        Alquiler alquiler = new Alquiler();

        alquiler.setLugarRecogida("Plaza Madrid");
        Date fecha= new Date(2023,10,10);
        alquiler.setFechaRecogida(fecha);
        alquiler.setHoraRecogida(fecha);
        alquiler.setLugarDevolucion("Barceñpma");
        Date fecha2= new Date(2021,1,1);
        alquiler.setFechaDevolucion(fecha2);
        alquiler.setHoraDevolucion(fecha2);


        alquiler.setVehiculo(vehi);
        alquiler.setCliente(clie);

        Alquiler alquilerGuardado=repo.save(alquiler);




    }

    @Test
    public void testAñadirAlquiler()
    {
        Alquiler alquiler = new Alquiler();

        Vehiculo vehiculo= new Vehiculo();
        vehiculo.setTipo("*4");
        vehiculo.setMarca("CITROEN");
        vehiculo.setModelo("C5x");
        vehiculo.setCapacidad(5);
        vehiculo.setMatricula("QW12335TG");

        Cliente cliente = new Cliente();
        cliente.setNombre("FRANCISCO");
        cliente.setApellidos("PEREZ PEREZ FLORZ");
        cliente.setTelefono("44444") ;
        cliente.setEmail("XXX@gmail.com");
        cliente.setDireccion("Calle la SPIDERMAN");


        alquiler.setLugarRecogida("Plaza España");
        Date fecha= new Date(2023,10,10);
        alquiler.setFechaRecogida(fecha);
        alquiler.setHoraRecogida(fecha);
        alquiler.setLugarDevolucion("Sevilla");
        Date fecha2= new Date(2021,1,1);
        alquiler.setFechaDevolucion(fecha2);
        alquiler.setHoraDevolucion(fecha2);

        alquiler.setCliente(cliente);
        alquiler.setVehiculo(vehiculo);

        Alquiler alquilerGuardado = repo.save(alquiler);

    }


}
