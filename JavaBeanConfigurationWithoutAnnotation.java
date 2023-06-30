package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBeanConfigurationWithoutAnnotation {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SportConfigWithoutAnnotationPureJavaClassConfiguration.class);

		// get the bean from the spring container
		Coach theCoach = context.getBean("swimCoachJavaConfiguration", SwimCoachJavaConfiguration.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		context.close();
	}

}
