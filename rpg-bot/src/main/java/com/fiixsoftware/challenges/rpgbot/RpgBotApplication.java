package com.fiixsoftware.challenges.rpgbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.fiixsoftware.challenges.rpgbot.persistence.repositories")
@EntityScan("com.fiixsoftware.challenges.rpgbot.persistence.models")
@SpringBootApplication
public class RpgBotApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(RpgBotApplication.class, args);
	}
}
