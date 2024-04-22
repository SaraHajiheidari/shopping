package com.shopping.services.customerservices;

import com.shopping.dtos.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{
    @Override
    public void addCustomer(CustomerDto customerDto) {

    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {

    }

    @Override
    public CustomerDto getCustomer(Long id) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
}
