package com.tamas.neo.test.neo4jDemoProject.repository;

import com.tamas.neo.test.neo4jDemoProject.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

    Person findByName(@Param("name") String name);

    Collection<Person> findByNameLike(@Param("name") String name);
}
