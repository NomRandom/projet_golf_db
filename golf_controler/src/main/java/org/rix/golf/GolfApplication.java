package org.rix.golf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "org.rix" })
@EntityScan("org.rix.entitys")
@EnableJpaRepositories("org.rix.jdbc")
public class GolfApplication {

	public static void main(String[] args) {
		SpringApplication.run(GolfApplication.class, args);
	}
}
