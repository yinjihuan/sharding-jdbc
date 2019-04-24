package com.cxytiandi.sharding.service;

import java.util.List;

import com.cxytiandi.sharding.po.LouDong;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
