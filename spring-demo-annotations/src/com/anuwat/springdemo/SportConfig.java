package com.anuwat.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.anuwat.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// expose bean service method

	@Bean
	public FortuneService sadFortuneService() {

		return new SadFortuneService();
	}

	// define bean for swim

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
