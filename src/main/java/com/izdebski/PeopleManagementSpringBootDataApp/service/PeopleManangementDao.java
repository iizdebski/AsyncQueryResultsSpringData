package com.izdebski.PeopleManagementSpringBootDataApp.service;

import com.izdebski.PeopleManagementSpringBootDataApp.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PeopleManangementDao extends CrudRepository<Person, Integer> {
}
