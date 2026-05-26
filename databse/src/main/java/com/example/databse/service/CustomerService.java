package com.example.databse.service;

import com.example.databse.interfac.CustomerInterface;
import com.example.databse.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // TODO...
public class CustomerService implements CustomerInterface {

    // Database TODO...
    List<Customer> clientes = new ArrayList<>();

    @Override
    public Customer buscarPorId(Long id) {
        return clientes.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
    }

    @Override
    public void guardar(Customer customer) {
        clientes.add(customer);
    }

    @Override
    public void eliminar(Long id) {
        clientes.remove(id);
    }

    @Override
    public List<Customer> traerTodos() {
        return clientes;
    }


    // TODO...
    @Override
    public Customer actualizar(Long id, Customer customer) {
        return null;
    }
}
