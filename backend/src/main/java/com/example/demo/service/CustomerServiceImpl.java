package com.example.demo.service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.OrderRepository;
import com.example.demo.dto.NewEmail;
import com.example.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Customer findById(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("NO Result Found"));
        return customer;
    }

    @Override
    public Customer findByFullName(String name) {
        Customer customer = customerRepository.findByFullName(name).orElseThrow(() -> new RuntimeException("No Result Found"));
        return customer;
    }

    @Override
    public List<Customer> findByCountOfOrders(Long countOfOrders) {
        return customerRepository.findByCountOfOrders(countOfOrders);
    }

    @Override
    public List<Customer> findByTotalPrice(BigDecimal totalPrice) {
        return customerRepository.findByTotalPrice(totalPrice);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomerEmail(NewEmail email) {
        customerRepository.updateCustomerEmail(email.getId(), email.getEmail());
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

}
