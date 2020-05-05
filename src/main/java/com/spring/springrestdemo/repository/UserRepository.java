package com.spring.springrestdemo.repository;

import com.spring.springrestdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
