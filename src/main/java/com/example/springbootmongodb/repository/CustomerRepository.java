/**
 * 
 */
package com.example.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springbootmongodb.model.Customer;

/**
 *
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
