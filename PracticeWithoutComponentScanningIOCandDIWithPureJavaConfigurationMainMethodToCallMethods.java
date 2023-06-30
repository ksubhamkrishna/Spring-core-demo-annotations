package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeWithoutComponentScanningIOCandDIWithPureJavaConfigurationMainMethodToCallMethods {

	public static void main(String[] args) {

		// read config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				PracticePureJavaSourceCodeJavaConfiguration.class);

		// get the bean from spring container
		Coach theCoach = context.getBean(
				"practiceIOCandDIWithoutComponentScanningPureJavaConfigurationCoachImplementation",
				PracticeIOCandDIWithoutComponentScanningPureJavaConfigurationCoachImplementation.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
