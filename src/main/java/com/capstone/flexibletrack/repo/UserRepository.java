package com.capstone.flexibletrack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.flexibletrack.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
