package com.example.jwt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.jwt.domain.Student;
import com.example.jwt.domain.StudentRepository;

@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}	
	
	@Bean
	public CommandLineRunner demo(StudentRepository repository) {
		return (args) -> {
		  Student s1 = new Student("John", "Johnson", "jj@mail.com");
		  Student s2 = new Student("Matt", "Matthews", "matt@mail.com");
		  Student s3 = new Student("Kate", "Kateson", "kate.k@mail.com");
		  
		  repository.save(s1);
		  repository.save(s2);
		  repository.save(s3);
		};
	}	
}
