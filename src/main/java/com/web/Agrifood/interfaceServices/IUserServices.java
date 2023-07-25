package com.web.Agrifood.interfaceServices;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.Agrifood.model.User;


public interface IUserServices {
	public List<User>  getAllUsers();
	public User getUserById(int id);
	public int newUser(User user);
	public int editUser(User user);
	public int deleteUser(int id);
}
