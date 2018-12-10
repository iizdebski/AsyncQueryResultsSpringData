package com.izdebski.PeopleManagementSpringBootDataApp.dao;

import java.util.List;

import com.izdebski.PeopleManagementSpringBootDataApp.entity.Person;
import com.izdebski.PeopleManagementSpringBootDataApp.service.PeopleManangementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PeopleManagementService {

    @Autowired
    private PeopleManangementDao peopleManangementDao;

    public Person createPerson(Person person1) {
        return peopleManangementDao.save(person1);
    }

    public Iterable<Person> createPersons(List<Person> personList) {
        Iterable<Person> list = peopleManangementDao.save(personList);
        return list;
    }

    public Iterable<Person> getPersonByIds(List<Integer> ids) {
        return peopleManangementDao.findAll(ids);
    }

    public void deletePersonEntity(Person person) {
        peopleManangementDao.delete(person);
    }

    public void updatePersonEmailById(int id, String newEmail) {
        Person person = peopleManangementDao.findOne(id);
        if(id==person.getId()){
            person.setEmail(newEmail);
        }
        peopleManangementDao.save(person);
    }
}