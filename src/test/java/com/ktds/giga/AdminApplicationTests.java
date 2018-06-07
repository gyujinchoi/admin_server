package com.ktds.giga;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ktds.giga.domain.MRListVO;
import com.ktds.giga.mapper.MRListMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminApplicationTests {

	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSessionFactory sqlSession;
	
	@Autowired
	private MRListMapper mapper;
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testConnection() throws Exception {
		System.out.println(ds);
		Connection con = ds.getConnection();
		System.out.println(con);
		con.close();
	}
	
	@Test
	public void testSqlSession() throws Exception {
		System.out.println(sqlSession);
		
	}
	
	@Test
	public void testSelect() throws Exception {
		MRListVO vo =  new MRListVO();
		vo = mapper.read2();
		System.out.println("testSelect: " + vo);
	}

}
