package com.example.repository;

import com.example.dataobject.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CartRepository extends PagingAndSortingRepository<Cart, Long>,
        CrudRepository<Cart, Long> {
}
