package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
