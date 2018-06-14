package com.ktds.giga;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ktds.giga.service.SRService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class daoTests {

	SRService service = new SRService();
	
	@Test
	public void test_SRList() throws Exception {
		System.out.println(service.retieveSR().toString());
		
	}
}
