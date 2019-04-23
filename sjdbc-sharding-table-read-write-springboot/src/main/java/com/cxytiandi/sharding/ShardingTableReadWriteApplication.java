package com.cxytiandi.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Spring Boot版 Sharding JDBC 不分库，只分表+读写分离案例
 * 
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 */
@SpringBootApplication
public class ShardingTableReadWriteApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShardingTableReadWriteApplication.class, args);
	}
}
