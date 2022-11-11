package com.ijse.springboot_mongodb.repository;

import com.ijse.springboot_mongodb.modal.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
