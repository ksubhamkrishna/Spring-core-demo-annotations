package com.luv2code.springdemo;

public class PracticeIOCandDIWithoutComponentScanningPureJavaConfigurationCoachImplementation implements Coach {

	private FortuneService fortuneService;

	public PracticeIOCandDIWithoutComponentScanningPureJavaConfigurationCoachImplementation(
			FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily Workout : Practice 7 ComponentScanningWoithoutComponentScanningDone and daily workout method of practice called";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
