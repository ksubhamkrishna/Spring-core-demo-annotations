package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Inversion of Control through Annotations calling other class called BasketBall through Bean id writing default bean id in our getBean method";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
