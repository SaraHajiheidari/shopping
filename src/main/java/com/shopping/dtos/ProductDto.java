package com.shopping.dtos;

import com.shopping.models.Categories;
import com.shopping.models.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Long product_ID;
    private Categories category;
    private String product_name;
    private List<Seller> sellers;

}
