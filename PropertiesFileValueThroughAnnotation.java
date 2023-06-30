package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesFileValueThroughAnnotation {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container using default bean Id
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class); // using the default bean id here to get the
		// bean // using the default bean id here to
		// get the bean and implementing inversion
		// of control
		// from the spring container.

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());

		// call the value to get the value
		System.out.println(theCoach.getEmail());

		System.out.println(theCoach.getTeam());

		// close the context
		context.close();
	}

}
