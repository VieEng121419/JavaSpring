package com.duongvietanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.buffer.LimitedDataBufferList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duongvietanh.dao.CustomerDAO;
import com.duongvietanh.entities.Customer;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerDAO customerDAO;
	public List<Customer> findAll(){	
		// TODO Auto-generated method stub
		return customerDAO.findAll();
	}

	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return customerDAO.findById(id);
	}

	public void save(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.save(customer);
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.update(customer);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		customerDAO.delete(id);
	}
	

}
