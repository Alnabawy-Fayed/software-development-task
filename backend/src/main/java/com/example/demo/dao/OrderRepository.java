package com.example.demo.dao;

import com.example.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.ResultSet;

public interface OrderRepository extends JpaRepository<Order,Long> {
//    @Query(value = "select count(*) as count , sum(total_price) as total from orders where customer_id = ?1",nativeQuery = true)
//    ResultSet findCustomerOrdersDetails(Long id);

}
