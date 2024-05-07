package com.juan.uri2615.dto;

import com.juan.uri2615.entities.Customers;

public class CustomerMinDto {

    private String city;

    public CustomerMinDto(String city) {
        this.city = city;
    }

    public CustomerMinDto(Customers customers) {
        this.city = customers.getCity();
    }

    public String getCity() {
        return city;
    }
}
