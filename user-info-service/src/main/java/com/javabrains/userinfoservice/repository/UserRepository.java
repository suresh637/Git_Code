package com.javabrains.userinfoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javabrains.userinfoservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User deleteByUserId(int userId);

}
