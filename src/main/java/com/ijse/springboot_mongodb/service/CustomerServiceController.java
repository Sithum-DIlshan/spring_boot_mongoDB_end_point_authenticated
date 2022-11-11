package com.ijse.springboot_mongodb.service;

import com.ijse.springboot_mongodb.modal.Customer;
import com.ijse.springboot_mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomerServiceController {
    @Autowired
    CustomerRepository repo;

    @GetMapping("/get")
    public String get() {
//        repo.save(new Customer("C001", "Saman", "Matara", 12));
        return "Hello World";
    }

    @GetMapping("/api/whoami")
    public String whoami(Authentication authentication) {
        // return information about the token
        return "accessed using token";
    }

    @PostMapping("/post")
    public String hello(@RequestBody Customer customer) {
        repo.save(customer);
        return "Hello World";
    }
}
