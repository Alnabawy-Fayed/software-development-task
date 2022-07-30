package com.example.demo.controller;

import com.example.demo.dto.CustomerOrdersDetails;
import com.example.demo.dto.NewEmail;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }
    @GetMapping("/customerId/{id}")
    public Customer getCustomer(@PathVariable("id") Long id){
        return customerService.findById(id);
    }
    @GetMapping("/customerName/{name}")
    public Customer getCustomer(@PathVariable("name") String name){
        return customerService.findByFullName(name);
    }
    @GetMapping("/customerOrderCount/{count}")
    public List<Customer> getCustomers(@PathVariable("count") Long count){
        return customerService.findByCountOfOrders(count);
    }
    @GetMapping("/customerOrderTotalPrice/{TotalPrice}")
    public List<Customer> getCustomers(@PathVariable("TotalPrice") BigDecimal totalPrice){
        return customerService.findByTotalPrice(totalPrice);
    }
    @GetMapping("/customerOrderDetails/{id}")
    public CustomerOrdersDetails findCustomerOrdersDetails(@PathVariable("id") Long id){
        return customerService.getCustomerOrdersDetails(id);
    }
    @PutMapping("/updateCustomerEmail")
    public void updateCustomerEmail(@RequestBody NewEmail newEmail){
        customerService.updateCustomerEmail(newEmail);
    }
    @DeleteMapping("/customerId/{id}")
    public void deleteCustomer(@PathVariable("id") Long id){
        customerService.deleteCustomer(id);
    }
}
