package com.example.repository;

import com.example.dataobject.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID>,
        CrudRepository<Customer, UUID> {
    List<Customer> findAllByCode(String code, Pageable pageable);
}
