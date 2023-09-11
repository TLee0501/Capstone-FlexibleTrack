package com.capstone.flexibletrack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.flexibletrack.facade.impl.UserFacadeImpl;
import com.capstone.flexibletrack.util.Constant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(value = Constant.API_USER)
public class UserRest {

	@Autowired
	private UserFacadeImpl userFacadeImpl;
}
