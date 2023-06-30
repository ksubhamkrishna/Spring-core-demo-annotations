package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sportJavaConfig.properties")
public class SportConfigWithoutAnnotationPureJavaClassConfiguration {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoachJavaConfiguration() {
		return new SwimCoachJavaConfiguration(sadFortuneService());
	}
}
