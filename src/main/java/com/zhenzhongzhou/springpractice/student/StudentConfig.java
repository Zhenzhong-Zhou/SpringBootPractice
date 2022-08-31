package com.zhenzhongzhou.springpractice.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.JUNE;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mm = new Student(
                    "mm",
                    "mm.z@gmail.com",
                    LocalDate.of(2000, APRIL, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.z@gmail.com",
                    LocalDate.of(2003, JUNE, 20)
            );

            repository.saveAll(List.of(mm, alex));
        };
    }
}
