package com.example.graphqlspringboot.repository;

import com.example.graphqlspringboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}
