package com.vinicpinheiro.vini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("repository")
@EntityScan("entities")
public class ViniApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViniApplication.class, args);
	}

}
