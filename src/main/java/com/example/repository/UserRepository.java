package com.example.repository;

import com.example.dataobject.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long>,
        CrudRepository<User, Long> {
}
