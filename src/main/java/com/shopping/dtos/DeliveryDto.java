package com.shopping.dtos;

import com.shopping.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryDto {
    private Long deliveries_Id;


    private Customer customer_ID;


    private Date date;
}
