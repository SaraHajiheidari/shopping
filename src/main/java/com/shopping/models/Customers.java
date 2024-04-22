package com.shopping.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_ID;

    @OneToMany
    private List<Payment> paymentList;


    @Size(min = 3 , message =  "you must have a name!")
    private String name;

    private String contact_add;

    private String address;

    @ManyToMany
    private List<Categories> categoriesList;

    @ManyToMany(mappedBy = "Customers")
    private List<Products> productsList;


    @OneToMany(mappedBy = "Customers")
    private List<Deliveries> deliveriesList;

    @OneToMany(mappedBy = "Order")
    private List<Order> orderList;
}
