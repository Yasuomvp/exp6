package com.rick.exp6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories("com.rick.exp6")
public class Exp6Application {

    public static void main(String[] args) {
        SpringApplication.run(Exp6Application.class, args);
    }

}
