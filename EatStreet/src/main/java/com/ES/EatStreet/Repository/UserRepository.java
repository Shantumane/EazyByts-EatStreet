package com.ES.EatStreet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ES.EatStreet.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	 User findByUsername(String username);
}
