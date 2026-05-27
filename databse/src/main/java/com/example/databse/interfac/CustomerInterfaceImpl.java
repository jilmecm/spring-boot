package com.example.databse.interfac;

import com.example.databse.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInterfaceImpl extends JpaRepository<Customer, Long> {
}
