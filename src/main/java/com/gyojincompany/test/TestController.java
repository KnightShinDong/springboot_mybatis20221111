package com.gyojincompany.test;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.test.dao.IDao;

@Controller
public class TestController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "test")
	public String test() {
	
	MemberDto dto = new MemberDto();
	
	
		return "test";
	}
	@RequestMapping(value = "/")
	public String Home() {
		
		return "test";
	}
	
	@RequestMapping (value = "insert")
	public String insert() {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		String id= "whitecat1";
		String pw="12345";
		String name="홍기동";
		String email="white@abc.cpm";
		
		dao.joinMemberDao(id, pw, name, email);
		
		return "insert";
	}
	
}
