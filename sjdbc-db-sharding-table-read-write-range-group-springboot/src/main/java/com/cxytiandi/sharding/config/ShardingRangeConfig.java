package com.cxytiandi.sharding.config;

import java.util.List;

public class ShardingRangeConfig {

	private long start;
	
	private long end;
	
	private List<String> datasourceList;

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}

	public List<String> getDatasourceList() {
		return datasourceList;
	}

	public void setDatasourceList(List<String> datasourceList) {
		this.datasourceList = datasourceList;
	}
	
}
