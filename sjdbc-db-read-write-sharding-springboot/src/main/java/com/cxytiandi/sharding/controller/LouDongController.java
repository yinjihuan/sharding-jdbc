package com.cxytiandi.sharding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cxytiandi.sharding.po.LouDong;
import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.service.LouDongService;
import com.cxytiandi.sharding.service.UserService;

@RestController
public class LouDongController {
	
	@Autowired
	private LouDongService louDongService;
	
	@GetMapping("/lds")
	public Object list() {
		return louDongService.list();
	}
	
	@GetMapping("/ld/add")
	public Object add() {
		for (long i = 0; i < 10; i++) {
			LouDong louDong = new LouDong();
			louDong.setId(i+"a");
			louDong.setCity("深圳");
			louDong.setRegion("宝安");
			louDong.setName("李四");
			louDong.setLdNum("A");
			louDong.setUnitNum("2");
			louDongService.addLouDong(louDong);
		}
		return "success";
	}
	
}
