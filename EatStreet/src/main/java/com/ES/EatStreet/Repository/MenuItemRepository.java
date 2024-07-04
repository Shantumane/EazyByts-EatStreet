package com.ES.EatStreet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ES.EatStreet.Entity.MenuItem;



@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

}
