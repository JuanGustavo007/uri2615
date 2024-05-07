package com.juan.uri2615.dto;

import com.juan.uri2615.entities.Customers;

public class CustomersDto {

    private Long id;
    private String name;
    private String street;
    private String city;

    public CustomersDto(Long id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
    }

    public CustomersDto(Customers customers) {
        this.id = customers.getId();
        this.name = customers.getName();
        this.street = customers.getStreet();
        this.city = customers.getCity();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}
