package com.shopping.dtos;

import com.shopping.models.Customers;
import com.shopping.models.Order;
import com.shopping.models.Payment;
import com.shopping.models.Products;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionReportsDto {
    private Long report_ID;


    private Customers customer_ID;

    private Order order_ID;

    private Products product_ID;

    private Payment payment_ID;
}
