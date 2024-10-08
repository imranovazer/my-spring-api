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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {



        return  args -> {
          Student mariam =   new Student("Mariam","maria@mail.ru", LocalDate.of(2000, Month.AUGUST,5));
            Student alex =   new Student("Alex","alex@mail.ru", LocalDate.of(2001, Month.AUGUST,5));

            studentRepository.saveAll(List.of(alex,mariam));
        } ;

    }
}
