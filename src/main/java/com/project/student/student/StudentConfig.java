package com.project.student.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sanne = new Student(
                    1L,
                    "Sanne",
                    "sannevanarwegen@hotmail.com",
                    LocalDate.of(1986, Month.MARCH, 04)
            );

            Student kasim = new Student(
                    "Kasim",
                    "kasim@hotmail.com",
                    LocalDate.of(2014, Month.MAY, 17)
            );

            repository.saveAll(List.of(sanne, kasim));

        };
    }
}
