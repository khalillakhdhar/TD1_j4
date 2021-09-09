package com.http.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.http.tp.classes.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
