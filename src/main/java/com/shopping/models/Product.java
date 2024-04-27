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
@Table(name = "products")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_ID;


    @Size(min = 3 , message = "product must have a name!")
    private String product_name;

    @ManyToOne
    @JoinColumn(name = "category_ID")
    private Category category;

    @OneToMany
    private List<TransactionReport> transactionReports ;

    @ManyToMany
    private List<Seller> sellerList;

    @ManyToMany
    @JoinTable(name = "product_customer_mapping",
    joinColumns = {@JoinColumn(name="product_ID")},
    inverseJoinColumns ={@JoinColumn(name="customer_ID")} )
    private List<Customer> customersList;

}
