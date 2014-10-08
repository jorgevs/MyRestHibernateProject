package com.jvs.resthibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvs.resthibernate.dao.UserDao;
import com.jvs.resthibernate.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User findByUserName(String userName) {		
		return userDao.findByName(userName);
	}

	@Override
	@Transactional
	public List<User> loadAllUsers() {
		return userDao.findAll();
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		userDao.save(user);
	}

	@Override
	@Transactional
	public User findUserById(Long id) {
		return userDao.findByID(id);
	}

	@Override
	@Transactional
	public void deleteUser(Long id) {
		userDao.delete(id);
	}

}
