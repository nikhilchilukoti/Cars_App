package com.cars.AccessoryService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.AccessoryService.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserNameAndConfirmed(String userName, Boolean confirmed);

	User findByUserName(String userName);
}
