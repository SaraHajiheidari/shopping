package com.shopping.services.sellerservices;

import com.shopping.dtos.ProductDto;
import com.shopping.dtos.SellerDto;

public interface ISellerService {
    void addSeller(SellerDto sellerDto);
    void updateSeller(SellerDto sellerDto , long id);
    ProductDto getSeller(long id);
    void deleteSeller(long id);
}
