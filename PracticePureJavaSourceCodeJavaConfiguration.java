package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticePureJavaSourceCodeJavaConfiguration {

	@Bean

	public FortuneService practiceIOCandDIWithoutComponentScanningPureJavaConfigurationFortuneImplementation() {

		return new PracticeIOCandDIWithoutComponentScanningPureJavaConfigurationFortuneImplementation();

	}

	@Bean
	public Coach practiceIOCandDIWithoutComponentScanningPureJavaConfigurationCoachImplementation() {

		return new PracticeIOCandDIWithoutComponentScanningPureJavaConfigurationCoachImplementation(
				practiceIOCandDIWithoutComponentScanningPureJavaConfigurationFortuneImplementation());
	}

}
