package com.shopping.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_ID;

    @ManyToOne
    @JoinColumn(name = "category_ID")
    private Categories category;

    @Size(min = 3 , message = "product must have a name!")
    private String product_name;

    @ManyToOne
    private Categories categorie;

    @OneToMany
    private List<TransactionReports> transactionReportsList;

    @ManyToMany
    private List<Seller> sellerList;

    @ManyToMany
    @JoinTable(name = "product_customer_mapping",
    joinColumns = {@JoinColumn(name="product_ID")},
    inverseJoinColumns ={@JoinColumn(name="customer_ID")} )
    private List<Customers> customersList;

}
