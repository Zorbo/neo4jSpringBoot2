package com.tamas.neo.test.neo4jDemoProject.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;



@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tamas.neo.test.neo4jDemoProject.controller"))
                .paths(PathSelectors.ant("/*"))
                .build()
                .apiInfo(apiInfo());
    }


    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Neo4J Spring Boot REST API",
                "POF for neo4j co operating with Spring Boot 2 API.",
                "UNDER CONSTRUCTION",
                "Terms of service",
                new Contact("Tamas Kiss", "go to git", "myeaddress@company.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
