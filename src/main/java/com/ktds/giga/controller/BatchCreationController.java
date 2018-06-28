package com.ktds.giga.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.giga.domain.BatchCreationVO;
import com.ktds.giga.domain.SRListVO;
import com.ktds.giga.domain.UserListVO;
import com.ktds.giga.service.BatchCreationService;

@RestController
public class BatchCreationController {
	
	private static final Logger logger = LoggerFactory.getLogger(BatchCreationController.class);

	@Autowired
	private BatchCreationService issueService;
	

	@RequestMapping("/insertIssue")
	public Map<String, String> insertIssue(@ModelAttribute List<BatchCreationVO> vo) throws Exception {
		
		logger.info("/insertIssue");
		Map<String, String> resultMap = new HashMap<String, String>();
		
		
		issueService.insrtIusse(vo);
		
		resultMap.put("resultCode", "0000");
		resultMap.put("resultMsg", "저장 성공");
		
		return resultMap;
	}
	
	@RequestMapping("/selectMrVer")
	public List<String> selectMrVer() throws Exception {
		logger.info("/selectMrVer");
		return issueService.selectMrVer();
	}
	
	@RequestMapping("/selectSRListByVer")
	public List<SRListVO> selectSRListByVer(String mrVersion) throws Exception {
		logger.info("/selectSRListByVer");
		return issueService.selectSRListByVer(mrVersion);
	}
	
	@RequestMapping("/selectUserList")
	public List<UserListVO> selectUserList(String mrVersion) throws Exception {
		return issueService.selectUserList();
	}
}
