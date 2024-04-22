package com.shopping.services.sellerservices;

import com.shopping.dtos.ProductDto;
import com.shopping.dtos.SellerDto;
import org.springframework.stereotype.Service;

@Service
public class SellerService implements ISellerService{


    @Override
    public void addSeller(SellerDto sellerDto) {

    }

    @Override
    public void updateSeller(SellerDto sellerDto, long id) {

    }

    @Override
    public ProductDto getSeller(long id) {
        return null;
    }

    @Override
    public void deleteSeller(long id) {

    }
}
