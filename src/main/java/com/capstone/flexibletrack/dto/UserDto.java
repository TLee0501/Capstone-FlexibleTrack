package com.capstone.flexibletrack.dto;

import java.io.Serializable;

import com.capstone.flexibletrack.util.CommonUtils;

import lombok.Data;

@Data
public class UserDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String username;
	
	public String toJson() {
		return CommonUtils.convertToString(this);
	}
}
