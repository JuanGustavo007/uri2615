package com.juan.uri2615.controller;

import com.juan.uri2615.dto.CustomerMinDto;
import com.juan.uri2615.dto.CustomersDto;
import com.juan.uri2615.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomersController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<CustomersDto> getCustomerService(@PathVariable Long id) {
        CustomersDto customersDto = customerService.findCustomerById(id);
        return ResponseEntity.ok(customersDto);
    }

    @GetMapping
    public ResponseEntity<List<CustomerMinDto>> getAllCustomers() {
        List<CustomerMinDto> customersDtos = customerService.findCustomersByCityOrder();
        return ResponseEntity.ok(customersDtos);
    }
}
