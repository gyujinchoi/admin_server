package com.ktds.giga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.giga.domain.SRListVO;
import com.ktds.giga.service.SRService;

@RestController
public class SRController {
	
	@Autowired
	private SRService service;
	
	@RequestMapping("/srList")
	public List<SRListVO> retieveSR() throws Exception {
		
		return service.retieveSR();
	}
	
	@RequestMapping("/srInsert")
	public String insertSR(SRListVO sr) throws Exception {
		
		service.insrtSR(sr);
		return "성공";
	}
}
