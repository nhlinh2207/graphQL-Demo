package com.example.graphqlspringboot.resolver.impl;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphqlspringboot.entity.Person;
import com.example.graphqlspringboot.repository.IPersonRepository;
import com.example.graphqlspringboot.resolver.IPersonResolver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonResolver implements IPersonResolver, GraphQLResolver {

    @Autowired
    private IPersonRepository personRepository;

    public List<Person> findAllPerson(){
        return personRepository.findAll();
    }
}
