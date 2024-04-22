package com.shopping.dtos;

import com.shopping.models.Products;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SellerDto {

    private Long seller_ID;
    private List<Products> producT_ID;
    private String name;

}
