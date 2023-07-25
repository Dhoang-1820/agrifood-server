package com.web.Agrifood.services;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Agrifood.interfaceServices.IUserServices;
import com.web.Agrifood.mapper.UserMapper;
import com.web.Agrifood.model.User;
import com.web.Agrifood.model.UserExample;

@Service
public class UserServices implements IUserServices {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> getAllUsers() {
		UserExample example = new UserExample();
		return userMapper.selectByExample(example);
	}

	@Override
	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int newUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int editUser(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int deleteUser(int id) {
		return userMapper.deleteByPrimaryKey(id);
	}

}
