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
public class CategoryDto {

    private Long category_ID;
    private String category_name;
    private String category_type;
    private List<Products> products;

}
