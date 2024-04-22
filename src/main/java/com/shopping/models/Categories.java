package com.shopping.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table
@Setter
@Getter
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_ID;

    @Size(min = 8, message = "category name must contain atleast 8 Charackter!")
    private String category_name;

    @Size(min = 8, message = "category name must contain atleast 8 Charackter!")
    private String category_type;

    @OneToMany(mappedBy = "Categories", orphanRemoval = true)
    private List<Products> products;

    @ManyToMany
    @JoinTable(name = "Customer_Category_Mapping" ,
    joinColumns = {@JoinColumn(name = "category_ID")},
            inverseJoinColumns = {@JoinColumn(name = "customer_ID")}
    )
    private List<Customers> customersList;
}
