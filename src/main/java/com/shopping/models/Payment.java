package com.shopping.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "payments")
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payment_ID;


    @DateTimeFormat
    private Date date;

    @ManyToOne
    @JoinColumn(name = "customer_ID")
    private Customer customer;//customer_Id(FK)
}
