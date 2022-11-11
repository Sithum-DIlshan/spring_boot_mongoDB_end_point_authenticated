package com.ijse.springboot_mongodb;

import com.ijse.springboot_mongodb.modal.Customer;
import com.ijse.springboot_mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringbootMongodbApplication  {



	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}


}
