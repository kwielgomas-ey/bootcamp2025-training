package org.bootcamp2025_ey.wlad.bootcamp2025_training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("org.bootcamp2025_ey.wlad.bootcamp2025_training.repository")
@EntityScan("org.bootcamp2025_ey.wlad.bootcamp2025_training.model")
@SpringBootApplication
public class Bootcamp2025TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bootcamp2025TrainingApplication.class, args);
	}

}
