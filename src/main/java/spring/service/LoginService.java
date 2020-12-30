package spring.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.LoginDao;
import spring.dto.User;

@Service
public class LoginService {
	
	@Autowired
	private LoginDao dao;
	
	public boolean select(User user) {

		List<User> userList = dao.loginSelect(user) ;
		if(userList.isEmpty()) {
			return false;
		}else {
			userList.stream().forEach(p->System.out.println(p.getRegdate()));
			return true;
		}
	}

}
