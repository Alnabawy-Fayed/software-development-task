package com.example.demo.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
public class CustomerOrdersDetails {
    private BigInteger totalOrders;
    private BigDecimal totalPrice;
}
