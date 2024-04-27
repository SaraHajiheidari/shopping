package com.shopping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name ="transaction_reports")
@NoArgsConstructor
@AllArgsConstructor
public class TransactionReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long report_ID;

    @ManyToOne
    @JoinColumn(name = "Customers_ID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "order_ID")
    private Order order;


    @OneToMany
    private List<Product> products ;

@ManyToOne
@JoinColumn(name = "payment_ID")
    private Payment payment;
}
