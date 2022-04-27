package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerDao;

@Service
public class CustomerService implements PersistableService<Customer>{

	@Autowired 
	private CustomerDao customerDao;
	
	public List<Customer> findAll() {
		return customerDao.findAll();
	}
	
	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public Optional<Customer> retrieveOne(int id) {
		return customerDao.findById(id);
	}

	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);
	}

}
