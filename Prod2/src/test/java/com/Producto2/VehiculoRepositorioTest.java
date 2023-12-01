package com.Producto2;



import com.Producto2.vehiculo.Vehiculo;
import com.Producto2.vehiculo.VehiculoRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)


public class VehiculoRepositorioTest {
    @Autowired
    private VehiculoRepositorio repo;

    @Test
    public void testAñadirVehiculo()
    {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTipo("Ranchera");
        vehiculo.setMarca("Mercedes");
        vehiculo.setModelo("Modelo 4,5,1,6");
        vehiculo.setCapacidad(4);
        vehiculo.setMatricula(("X123456YY"));

        Vehiculo vehiculoGuardado=repo.save(vehiculo);

    }

    @Test
    public void testAñadirVehiculo2()
    {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTipo("Familiar");
        vehiculo.setMarca("Audi");
        vehiculo.setModelo("Modelo xx");
        vehiculo.setCapacidad(7);
        vehiculo.setMatricula(("ZDD123456BB"));

        Vehiculo vehiculoGuardado=repo.save(vehiculo);

    }






}

