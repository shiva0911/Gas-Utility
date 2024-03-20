package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService 

{
	Customer createCustomer(Customer customer);
    Customer getCustomerById(Long id);
    List<Customer> getAllCustomers();

}
