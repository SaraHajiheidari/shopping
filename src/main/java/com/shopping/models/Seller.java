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
@Table(name ="sellers")
@NoArgsConstructor
@AllArgsConstructor
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seller_ID;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_seller_mapping" ,
    joinColumns ={@JoinColumn (name = "Join_seller_ID", referencedColumnName = "seller_ID")},
    inverseJoinColumns ={@JoinColumn(name = "Join_product_Id",referencedColumnName = "product_ID")})
    private List<Product> producT_ID;

    private String name;
}
