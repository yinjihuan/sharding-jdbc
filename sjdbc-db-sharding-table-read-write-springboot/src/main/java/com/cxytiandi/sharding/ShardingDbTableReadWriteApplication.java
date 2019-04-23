package com.cxytiandi.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot版 Sharding JDBC 分库分表+读写分离案例
 * 
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 */
@SpringBootApplication
public class ShardingDbTableReadWriteApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShardingDbTableReadWriteApplication.class, args);
	}
}
