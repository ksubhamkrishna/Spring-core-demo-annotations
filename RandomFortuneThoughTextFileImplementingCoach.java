package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneThoughTextFileImplementingCoach implements Coach {

	@Autowired
	@Qualifier("exercisePostConstructReadFromTxtClass")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {

		return "Accessing Random Fortune from Text file using Array List";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
