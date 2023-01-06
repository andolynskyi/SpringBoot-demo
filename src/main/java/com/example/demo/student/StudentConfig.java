package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 2)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1991, Month.DECEMBER, 17)
            );
            Student petro = new Student(
                    "Petro",
                    "petro@gmail.com",
                    LocalDate.of(1996, Month.JANUARY, 23)
            );

            repository.saveAll(
                    List.of(mariam, alex, petro)
            );

        };
    }
}
