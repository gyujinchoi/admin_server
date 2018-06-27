package com.ktds.giga.mapper;

import java.util.List;

import com.ktds.giga.domain.BatchCreationVO;
import com.ktds.giga.domain.SRListVO;

public interface BatchCreationMapper {
	
	public void insertIssue(BatchCreationVO issue) throws Exception;
	
	public List<String> selectMrVer() throws Exception;
	
	public List<SRListVO> selectSRListByVer(String mrVersion) throws Exception;
}

