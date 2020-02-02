package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            
            bookstoreService.persistAuthor();
            bookstoreService.displayAuthor();
        };
    }
}

/*
 * How To View Query Details Via log4jdbc

Description: View the query details via log4jdbc.

Key points:

for Maven, in pom.xml, add log4jdbc dependency
Output sample:

 * 
 * 
 */
