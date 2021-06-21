package com.salao.belasalao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class BelaSalaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BelaSalaoApplication.class, args);
    }

}
