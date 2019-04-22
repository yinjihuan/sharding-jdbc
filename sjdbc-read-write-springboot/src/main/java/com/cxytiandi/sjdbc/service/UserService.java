package com.cxytiandi.sjdbc.service;

import java.util.List;

import com.cxytiandi.sjdbc.po.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
}
