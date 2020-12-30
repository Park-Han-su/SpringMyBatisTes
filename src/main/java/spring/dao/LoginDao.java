package spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.dto.User;

@Component
public class LoginDao {

	@Autowired
	SqlSession sqlSession;
	
	public List<User> loginSelect(User user){
		return sqlSession.selectList("spring.sql.Mapper.loginSelect", user);
	}
}
