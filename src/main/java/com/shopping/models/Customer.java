package com.shopping.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_ID;

    @OneToMany
    private List<Payment> paymentList = new ArrayList<>();


    @Size(min = 3 , message =  "you must have a name!")
    private String name;

    private String contact_add;

    private String address;

    @ManyToMany
    private List<Category> categoriesList;

    @ManyToMany
    private List<Product> productsList ;


    @OneToMany(mappedBy = "customer")
    private List<Delivery> deliveriesList ;

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;
}
