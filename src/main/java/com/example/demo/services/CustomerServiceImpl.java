package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    private CustomerRepository customerRepository;
	@Override
	public Customer createCustomer(Customer customer) {
		 return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

	@Override
	public List<Customer> getAllCustomers() 
	{
		return customerRepository.findAll();
		
	}

}
