package com.customspring.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JULY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student nahian=new Student(
                       "Nahian",
                        LocalDate.of(1999, JULY,7),
                        "nahian@gmail.com"
                );
            Student tondra=new Student(
                    "Tondra",
                    LocalDate.of(1999, JULY,9),
                    "tondra@gmail.com"
            );
            repository.saveAll(
                    List.of(nahian, tondra)
            );
        };
    }
}
