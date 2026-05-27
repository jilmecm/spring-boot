package com.example.databse.controller;

import com.example.databse.interfac.CustomerInterface;
import com.example.databse.model.Customer;
import com.example.databse.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class CustomerController {

    private CustomerService customerService;

    // TODO...
    public CustomerController(CustomerService customerService ) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(customerService.buscarPorId(id).get());
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
