package com.example.demo.service;

import com.example.demo.dto.CustomerOrdersDetails;
import com.example.demo.dto.NewEmail;
import com.example.demo.entity.Customer;

import java.math.BigDecimal;
import java.util.List;

public interface CustomerService {
    public Customer findById(Long id);
    public Customer findByFullName(String name);
    public List<Customer> findByCountOfOrders(Long countOfOrders);
    public List<Customer> findByTotalPrice(BigDecimal totalPrice);
    public void addCustomer(Customer customer);
    public void updateCustomerEmail(NewEmail email);
    public void deleteCustomer(Long id);
    public CustomerOrdersDetails getCustomerOrdersDetails(Long id);
}
