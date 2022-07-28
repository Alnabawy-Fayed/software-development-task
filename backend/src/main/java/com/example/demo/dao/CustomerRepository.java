package com.example.demo.dao;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Optional<Customer> findByFullName(String name);
    @Query(value = "select * from customer where id in (select customer_id from orders where total_price = ?1)",nativeQuery = true)
    List<Customer> findByTotalPrice(BigDecimal totalPrice);

    @Query(value = "select * from customer where id in (select customer_id from orders where items_count = ?1)",nativeQuery = true)
    List<Customer> findByCountOfOrders(Long count);

    @Modifying
    @Query(value = "update customer set email = ?2 where id = ?1",nativeQuery = true)
    void updateCustomerEmail(Long id,String email);
     void deleteById(Long id);
}
