package com.ktds.giga.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktds.giga.domain.BatchCreationVO;
import com.ktds.giga.domain.SRListVO;
import com.ktds.giga.domain.UserListVO;
import com.ktds.giga.mapper.BatchCreationMapper;

@Service
public class BatchCreationService {
	@Autowired
	private BatchCreationMapper mapper;
	
	public void insrtIusse(List<BatchCreationVO> issues) throws Exception{
		
		for (BatchCreationVO issue : issues) {
			mapper.insertIssue(issue);
		}
	}
	
	public List<String> selectMrVer() throws Exception {
		List<String> mrVerList = new ArrayList<String>();
		mrVerList = mapper.selectMrVer();
		return mrVerList;
			
	}
	
	public List<SRListVO> selectSRListByVer(String mrVersion) throws Exception {
		return mapper.selectSRListByVer(mrVersion);
	}
	
	public List<UserListVO> selectUserList()  throws Exception {
		return mapper.selectUserList();
	}
	 
}

