package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // here not specifying the bean id a default bean id will be created using
			// @Component as tennisCoach same as that of class name with first lower
			// lowercase rest the same.
@Scope("singleton") // creates new instance every time
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(
				">> Inside of my PostConstruct method(Defined in TennisCoach class) after creation of beans inside of doMyStartupStuff named init post bean construct method");
	}

	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(
				">> Inside of my PreDestroy method(Defined in TennisCoach class) before destruction of beans inside of doMyCleanupStuff named destroy method pre bean destruction method");
	}

	/*
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	/*
	 * @Autowired public TennisCoach(FortuneService thefortuneService) {
	 * 
	 * fortuneService = thefortuneService; }
	 */

	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
