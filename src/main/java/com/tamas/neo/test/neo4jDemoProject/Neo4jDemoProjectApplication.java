package com.tamas.neo.test.neo4jDemoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("com.tamas.neo.test.neo4jDemoProject.repository")
public class Neo4jDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jDemoProjectApplication.class, args);
	}

}
