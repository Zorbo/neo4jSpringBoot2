package com.tamas.neo.test.neo4jDemoProject.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * THIS IS AN ENTITY FOR RELATIONSHIP, so this is a relationship entity
 */
@RelationshipEntity(type = "ACTED_IN")
@Data
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private List<String> roles = new ArrayList<>();

    /**
     * We need to specify a start node and an end node
     */
    @StartNode
    private Person person;

    @EndNode
    private Movie movie;

    public void addRoleName(String name) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(name);
    }
}
