package com.shopping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table
@NoArgsConstructor
@AllArgsConstructor
public class TransactionReports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long report_ID;

    @ManyToOne
    @JoinColumn(name = "Customers_ID")
    private Customers customer;

    @ManyToOne
    @JoinColumn(name = "order_ID")
    private Order order_ID;


    @OneToMany
    private List<Products> product_ID;

@ManyToOne
@JoinColumn(name = "payment_ID")
    private Payment payment_ID;
}
