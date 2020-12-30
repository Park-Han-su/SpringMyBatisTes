package spring.sql;


import java.util.Map;

import org.springframework.stereotype.Component;

import com.sun.tools.javac.util.List;

import spring.dto.User;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

	public List<User> loginSelect(User user);
}
