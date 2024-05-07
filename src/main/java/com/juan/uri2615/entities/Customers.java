package com.juan.uri2615.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street;
    private String city;

    public Customers(Long id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
    }

    public Customers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
