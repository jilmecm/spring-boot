package com.example.databse.service;

import com.example.databse.interfac.CustomerInterface;
import com.example.databse.interfac.CustomerInterfaceImpl;
import com.example.databse.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // TODO...
public class CustomerService implements CustomerInterface {

    private CustomerInterfaceImpl customerInterface;

    public CustomerService(CustomerInterfaceImpl customerInterface) {
        this.customerInterface = customerInterface;
    }

    @Override
    public Optional<Customer> buscarPorId(Long id) {
        return Optional.of(customerInterface.findById(id)).get();
    }

    @Override
    public void guardar(Customer customer) {
        customerInterface.save(customer);
    }

    @Override
    public void eliminar(Long id) {
        Optional<Customer> isExist = customerInterface.findById(id);

        if (!isExist.isPresent()){
            throw new RuntimeException("El usuario con id " + id + " no existe");
        }

        customerInterface.deleteById(id);
    }

    @Override
    public List<Customer> traerTodos() {
        return customerInterface.findAll();
    }


    // TODO... task
    @Override
    public Customer actualizar(Long id, Customer customer) {
        return null;
    }
}
