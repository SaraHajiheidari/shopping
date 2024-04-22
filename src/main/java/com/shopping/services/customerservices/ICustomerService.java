package com.shopping.services.customerservices;

import com.shopping.dtos.CategoryDto;
import com.shopping.dtos.CustomerDto;

public interface ICustomerService {
    void addCustomer(CustomerDto customerDto);
    void updateCustomer(CustomerDto customerDto);
    CustomerDto getCustomer(Long id);
    void deleteCustomer(Long id);
}
