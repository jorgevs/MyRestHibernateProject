package com.jvs.resthibernate.dao;

import com.jvs.resthibernate.entity.Person;

public interface PersonDao extends BaseDao<Person, Long> {

	public Person findByName(String firstName, String lastName);

}
