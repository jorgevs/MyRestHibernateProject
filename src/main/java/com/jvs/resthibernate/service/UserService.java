package com.jvs.resthibernate.service;

import java.util.List;

import com.jvs.resthibernate.entity.User;

public interface UserService {

	public User findByUserName(String userName);

	public List<User> loadAllUsers();

	public void saveUser(User user);

	public User findUserById(Long id);

	public void deleteUser(Long id);
}
