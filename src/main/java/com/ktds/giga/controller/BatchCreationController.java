package com.ktds.giga.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.giga.domain.BatchCreationVO;
import com.ktds.giga.domain.SRListVO;
import com.ktds.giga.service.BatchCreationService;

@RestController
public class BatchCreationController {
	
	
	@Autowired
	private BatchCreationService issueService;
	

	@RequestMapping("/insertIssue")
	public Map<String, String> insertIssue(@ModelAttribute List<BatchCreationVO> vo) throws Exception {
		System.out.println("ttttttttttttttt");
		Map<String, String> resultMap = new HashMap<String, String>();
		
		System.out.println(vo.toString());
		issueService.insrtIusse(vo);
		
		resultMap.put("resultCode", "0000");
		resultMap.put("resultMsg", "저장 성공");
		
		return resultMap;
	}
	
	@RequestMapping("/selectMrVer")
	public List<String> selectMrVer() throws Exception {
		return issueService.selectMrVer();
	}
	@RequestMapping("/selectSRListByVer")
	public List<SRListVO> selectSRListByVer(String mrVersion) throws Exception {
		return issueService.selectSRListByVer(mrVersion);
	}
}
