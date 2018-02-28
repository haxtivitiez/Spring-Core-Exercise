package com.anuwat.springdemo;

public class BaseballCoach implements Coach {

	// define private field for dependency
	private FortuneService fortuneService;

	// constructor for inject
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service
		return fortuneService.getFortune();
	}

}
