package com.example.eznote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class EzNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzNoteApplication.class, args);
	}
}
