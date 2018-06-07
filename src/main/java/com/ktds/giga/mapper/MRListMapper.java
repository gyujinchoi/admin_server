package com.ktds.giga.mapper;

import org.apache.ibatis.annotations.Select;

import com.ktds.giga.domain.MRListVO;

public interface MRListMapper {
	
	@Select("select * from test")
	public MRListVO read() throws Exception;
	
	public MRListVO read2() throws Exception;

}
