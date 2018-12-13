package com.hexaware.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	 
}
