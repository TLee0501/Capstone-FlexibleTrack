package com.capstone.flexibletrack.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.flexibletrack.repo.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository repo;
}
