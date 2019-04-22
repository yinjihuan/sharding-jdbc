package com.cxytiandi.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 不分库，只分表+读写分离案例
 * @author yinjihuan
 */
@SpringBootApplication
public class ShardingTableReadWriteApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShardingTableReadWriteApplication.class, args);
	}
}
