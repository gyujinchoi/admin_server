package com.ktds.giga.mapper;

import java.util.List;

import com.ktds.giga.domain.SRListVO;

public interface SRMapper {
	
	public List<SRListVO> srList() throws Exception;
	
	public void srInsert(SRListVO sr) throws Exception;
}
