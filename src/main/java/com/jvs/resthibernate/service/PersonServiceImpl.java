package com.jvs.resthibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvs.resthibernate.dao.PersonDao;
import com.jvs.resthibernate.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	


	@Override
	@Transactional
	public Person findByPersonName(String firstName, String lastName) {		
		return personDao.findByName(firstName, lastName);
	}	
	
	@Override
	@Transactional
	public List<Person> loadAllPersons() {
		return personDao.findAll();
	}
	
	@Override
	@Transactional
	public void savePerson(Person person) {
		personDao.save(person);
	}	
	
	@Override
	@Transactional
	public Person findPersonById(Long id) {
		return personDao.findByID(id);
	}	
	
	@Override
	@Transactional
	public void deletePerson(Long id) {
		personDao.delete(id);
	}

}
