package com.shopping.services.customerservices;

import com.shopping.dtos.CustomerDto;
import com.shopping.reposietories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private CustomerRepository customerRepository;
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
