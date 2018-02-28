package com.anuwat.springdemo;

public class TrackCoach implements Coach {
	
	public TrackCoach() {
		
	}

	// define private field for dependency
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside Init");
	}
	
	
	// add destroy method
	
	public void doMyStartupYoYo() {
		System.out.println("TrackCoach: inside destroy");
	}

}
