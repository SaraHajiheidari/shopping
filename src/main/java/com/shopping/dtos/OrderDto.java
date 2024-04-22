package com.shopping.dtos;

import com.shopping.models.Customers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Long order_ID;
    private Customers customer_ID;
    private Date date;

}
