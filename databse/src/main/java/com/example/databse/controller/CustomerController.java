package com.example.databse.controller;

import com.example.databse.interfac.CustomerInterface;
import com.example.databse.model.Customer;
import com.example.databse.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService ) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.buscarPorId(id));
    }

    @PostMapping
    public void guardar(@RequestBody Customer customer){
        customerService.guardar(customer);
    }

    @GetMapping
    public List<Customer> traerTodos(){
        return customerService.traerTodos();
    }

}
