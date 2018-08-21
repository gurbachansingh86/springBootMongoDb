package com.example.springbootmongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmongodb.model.Customer;
import com.example.springbootmongodb.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	@RequestMapping(method = RequestMethod.POST, value = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer create(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(Customer customer) {
		customerRepository.save(customer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customer/{id}")
	public void delete(@PathVariable String id) {
		customerRepository.deleteById(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/customers")
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/customer/{id}")
	public Optional<Customer> get(@PathVariable String id) {
		return customerRepository.findById(id);
	}
}
