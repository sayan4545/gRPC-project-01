package com.dev.sayan.algocamp.grpcproject01;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GrpcProject01Application {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();
        dotenv.entries()
                        .forEach(entry->System.setProperty(entry.getKey(),entry.getValue()));
        SpringApplication.run(GrpcProject01Application.class, args);
    }
}
