package com.cxytiandi.sharding.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import com.cxytiandi.sharding.config.ShardingRangeConfig;

/**
 * 自定义分片算法
 * 
 * @author yinjihuan
 *
 */
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

	private static List<ShardingRangeConfig> configs = new ArrayList<>();
	
	static {
		ShardingRangeConfig config = new ShardingRangeConfig();
		config.setStart(1);
		config.setEnd(30);
		config.setDatasourceList(Arrays.asList("ds0", "ds1"));
		configs.add(config);
		
		config = new ShardingRangeConfig();
		config.setStart(31);
		config.setEnd(60);
		config.setDatasourceList(Arrays.asList("dss0", "dss1"));
		configs.add(config);
	}
	
	@Override
	public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
		Optional<ShardingRangeConfig> configOptional = configs.stream().filter(
				c -> shardingValue.getValue() >= c.getStart() && shardingValue.getValue() <= c.getEnd()).findFirst();
		if (configOptional.isPresent()) {
			ShardingRangeConfig rangeConfig = configOptional.get();
			for (String ds : rangeConfig.getDatasourceList()) {
				if (ds.endsWith(shardingValue.getValue() % 2 + "")) {
					System.err.println(ds);
					return ds;
				}
			}
		}
		throw new IllegalArgumentException();
	}

}
