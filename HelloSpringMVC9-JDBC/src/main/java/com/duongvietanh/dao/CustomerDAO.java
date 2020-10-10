package com.duongvietanh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duongvietanh.entities.Customer;
import com.nguyenanhtu.entities.CustomerMapper;

@Service
@Transactional
public class CustomerDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public Customer findById(int id) {
		// TODO Auto-generated method stub
		String sql ="SELECT * FROM customer WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new CustomerMapper(), id);
	}

	public void save(Customer customer) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO customer ( name, address) VALUES ( ?, ?)";
		jdbcTemplate.update(sql, customer.getName(), customer.getAddress());
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		String sql ="UPDATE customer SET name = ?, address = ? WHERE id= ? ";
		jdbcTemplate.update(sql, customer.getName(), customer.getAddress(), customer.getId());
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql ="DELETE FROM customer WHERE id = " + id;
		jdbcTemplate.update(sql);
	}

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		String sql ="SELECT * FROM customer";
		return jdbcTemplate.query(sql, new CustomerMapper());
	}
}
