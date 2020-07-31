package com.cars.ColorService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.ColorService.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserNameAndConfirmed(String userName, Boolean confirmed);

	User findByUserName(String userName);
}
