package com.crudServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudServer.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
