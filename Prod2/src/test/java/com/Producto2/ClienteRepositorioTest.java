package com.Producto2;

import com.Producto2.cliente.Cliente;
import com.Producto2.cliente.ClienteRepositorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ClienteRepositorioTest {
    @Autowired private ClienteRepositorio repo;

    @Test
    public void testAñadirCliente(){
        Cliente cliente = new Cliente();
        cliente.setNombre("LOLA");
        cliente.setApellidos("FLOREZ FLORZ");
        cliente.setTelefono("22222") ;
        cliente.setEmail("QQQer@gmail.com");
        cliente.setDireccion("Calle la SUPERMAN");

        Cliente clienteGuardado= repo.save(cliente);
    }
    @Test
    public void TestListarTodosLosClientes(){
        Iterable <Cliente> clientes= repo.findAll();

        for(Cliente cliente: clientes)
        {
            System.out.println(cliente);
        }
    }

}