package com.ktds.giga.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.giga.domain.MRListVO;

@RestController
public class MRController {
	@RequestMapping("/MR")
	public MRListVO MRList() {
		
		MRListVO vo = new MRListVO();
		vo.setName("Test Nmae");
		vo.setPhone_no("01065501469");
		return vo;
	}
}
