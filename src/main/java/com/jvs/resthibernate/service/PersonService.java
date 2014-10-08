package com.jvs.resthibernate.service;

import java.util.List;

import com.jvs.resthibernate.entity.Person;

public interface PersonService {
	
    public Person findByPersonName(String firstName, String lastName);
    
    public List<Person> loadAllPersons();
 
    public void savePerson(Person person);
 
    public Person findPersonById(Long id);
 
    public void deletePerson(Long id);	
	
}
