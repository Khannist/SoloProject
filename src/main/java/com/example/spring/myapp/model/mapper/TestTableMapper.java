/**
 * 
 */
package com.example.spring.myapp.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author CafeAlle
 *
 */
@Mapper
public interface TestTableMapper {
	String selectList = "select * FROM user_dt";
	
	
	//select * from Test_Table
	public List<Map<String, Object>> SelectAllList() throws Exception;
	
	@Select(selectList)
	public List<Map<String, Object>> SelectAllList2() throws Exception;

}
