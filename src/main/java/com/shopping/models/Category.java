package com.shopping.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_ID;

    @Size(min = 8, message = "category name must contain atleast 8 Charackter!")
    private String category_name;

    @Size(min = 8, message = "category name must contain atleast 8 Charackter!")
    private String category_type;

    @OneToMany(mappedBy = "category", orphanRemoval = true , cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
    private List<Product> products ;

    @ManyToMany
    @JoinTable(name = "Customer_Category_Mapping" ,
    joinColumns = {@JoinColumn(name = "category_id")},
            inverseJoinColumns = {@JoinColumn(name = "customer_ID")}
    )
    private List<Customer> customersList;
}
