package com.shopping.services.productservices;

import com.shopping.dtos.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{
    @Override
    public void addProduct(ProductDto productDto) {

    }

    @Override
    public void updateProduct(ProductDto productDto, long id) {

    }

    @Override
    public ProductDto getProduct(long id) {
        return null;
    }

    @Override
    public void deleteProduct(long id) {

    }
}
