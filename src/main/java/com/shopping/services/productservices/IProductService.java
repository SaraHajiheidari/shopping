package com.shopping.services.productservices;

import com.shopping.dtos.CategoryDto;
import com.shopping.dtos.ProductDto;

public interface IProductService {
    void addProduct(ProductDto productDto);
    void updateProduct(ProductDto productDto , long id);
    ProductDto getProduct(long id);
    void deleteProduct(long id);
}
