package com.shopping.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_ID;

    @ManyToOne
    @JoinColumn(name = "customer_ID")
    private Customers customer;

    @DateTimeFormat
    private Date date;

    @OneToMany
    private List<TransactionReports> transactionReportsList;
}
