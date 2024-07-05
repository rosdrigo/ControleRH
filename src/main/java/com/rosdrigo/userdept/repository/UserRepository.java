package com.rosdrigo.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosdrigo.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
