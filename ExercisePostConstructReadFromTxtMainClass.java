package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExercisePostConstructReadFromTxtMainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		RandomFortuneThoughTextFileImplementingCoach theRead = context.getBean(
				"randomFortuneThoughTextFileImplementingCoach", RandomFortuneThoughTextFileImplementingCoach.class);

		System.out.println(theRead.getDailyWorkout());

		System.out.println(theRead.getDailyFortune());

		context.close();
	}

}
