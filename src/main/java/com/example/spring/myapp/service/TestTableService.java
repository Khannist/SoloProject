package com.example.spring.myapp.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface TestTableService {
	
	//select * from Test_Table
	public List<Map<String, Object>> SelectAllList() throws Exception;
	
	public List<Map<String, Object>> SelectAllList2() throws Exception;
}
