package com.example.databse.interfac;

import com.example.databse.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerInterface {
     void guardar(Customer customer);
     void eliminar(Long id);
     Optional<Customer> buscarPorId(Long id);
     List<Customer> traerTodos();
     Customer actualizar(Long id , Customer customer);
}
