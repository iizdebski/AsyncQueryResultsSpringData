package com.izdebski.PeopleManagementSpringBootDataApp.dao;

import com.izdebski.PeopleManagementSpringBootDataApp.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.concurrent.CompletableFuture;

public interface PeopleManangementService extends CrudRepository<Person, Integer> {
    CompletableFuture<Person> findByEmail(String email);
}