package com.ktds.giga.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.giga.domain.SRListVO;
import com.ktds.giga.service.SRService;

@RestController
public class SRController {
	
	@Autowired
	private SRService service;
	
	@RequestMapping("/selectSRList")
	public List<SRListVO> retieveSR() throws Exception {
		return service.retieveSR();
	}
	
	@RequestMapping("/insertSR")
	public Map<String, String> insertSR(SRListVO sr) throws Exception {
		Map<String, String> resultMap = new HashMap<String, String>();
		
		service.insrtSR(sr);
		
		resultMap.put("resultCode", "0000");
		resultMap.put("resultMsg", "저장 성공");
		return resultMap;
	}
}
