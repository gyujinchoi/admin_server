package com.ktds.giga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktds.giga.domain.SRListVO;
import com.ktds.giga.mapper.SRMapper;

@Service
public class SRService {
	@Autowired
	private SRMapper mapper;
	
	public List<SRListVO> retieveSR() throws Exception{
			return mapper.srList();
	}
	
	public void insrtSR(SRListVO sr) throws Exception{
		mapper.srInsert(sr);
	}
}
