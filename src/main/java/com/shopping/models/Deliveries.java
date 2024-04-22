package com.shopping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Deliveries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveries_Id;

   @ManyToOne
   @JoinColumn(name = "customer_ID")
    private Customers customer;

    @DateTimeFormat
    private Date date;
}
