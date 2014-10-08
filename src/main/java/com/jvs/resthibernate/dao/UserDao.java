package com.jvs.resthibernate.dao;

import com.jvs.resthibernate.entity.User;

public interface UserDao extends BaseDao<User, Long> {

	public User findByName(String userName);

}
