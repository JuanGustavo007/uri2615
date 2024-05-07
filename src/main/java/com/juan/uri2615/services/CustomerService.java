package com.juan.uri2615.services;

import com.juan.uri2615.dto.CustomerMinDto;
import com.juan.uri2615.dto.CustomersDto;
import com.juan.uri2615.entities.Customers;
import com.juan.uri2615.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomersRepository customersRepository;


    @Transactional(readOnly = true)
    public CustomersDto findCustomerById( Long id) {
        Customers customer = customersRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return new CustomersDto(customer);
    }

    @Transactional
    public List<CustomerMinDto> findCustomersByCityOrder(){
        List<CustomerMinDto> customers = customersRepository.searchCustomerDistinct();
        return customers;
    }



}
