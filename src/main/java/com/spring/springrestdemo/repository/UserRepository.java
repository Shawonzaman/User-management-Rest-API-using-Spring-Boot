package com.spring.springrestdemo.repository;

import com.spring.springrestdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByCountry(String country);

}
