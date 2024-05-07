package com.juan.uri2615.repository;

import com.juan.uri2615.dto.CustomerMinDto;
import com.juan.uri2615.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomersRepository extends JpaRepository<Customers, Long> {

    @Query("SELECT DISTINCT new com.juan.uri2615.dto.CustomerMinDto(c.city ) FROM Customers c")
    List<CustomerMinDto> searchCustomerDistinct();
}
