package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student fernando = new Student(1L, "Fernando", "fdgbatarse@gmail.com", LocalDate.of(2001, Month.MARCH,28));
            
            repository.saveAll(
                List.of(fernando)
            );
        };
    }
}
