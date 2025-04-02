package com.example.SpringTest.repository;

import com.example.SpringTest.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByName(String name);

    List<Person> findByAgeGreaterThan(int age);

    long countByName(String name);

}
