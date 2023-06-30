package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemoAppUsingJavaCodeConfig {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SportConfigWithoutAnnotationPureJavaClassConfiguration.class);

		// get the bean from spring container
		SwimCoachJavaConfiguration theCoach = context.getBean("swimCoachJavaConfiguration",
				SwimCoachJavaConfiguration.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// call our new swim Coach methods . . . has the properties values injected
		System.out.println("email:" + theCoach.getEmail());

		System.out.println("team:" + theCoach.getTeam());

		// close the context
		context.close();

	}

}
