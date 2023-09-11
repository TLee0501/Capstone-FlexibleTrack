package com.capstone.flexibletrack.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.flexibletrack.service.impl.UserServiceImpl;

@Service
public class UserFacadeImpl {

	@Autowired
	private UserServiceImpl userServiceImpl;
}
