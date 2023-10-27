package com.example.accessingdatamysql.student;


import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
        StudentRepository repository
    ){
        return args->{
             Student godefroy =new Student(
                            
                            "godefroy",
                            "moi@gmail.com",
                            LocalDate.of(1996, 10,04)
                            
                );
                Student dada =new Student(
                           
                            "dada",
                            "dada@gmail.com",
                            LocalDate.of(2011, 10,8)
                            
                );

                repository.saveAll(
                    List.of(godefroy,dada)
                );
        };
    }
}
