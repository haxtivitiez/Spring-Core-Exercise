package com.anuwat.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String emailAddress;
	private String teamName;

	// no-arg construct
	public CricketCoach() {
		System.out.println("Inside CricketCoach : no-arg");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setEmailAddress ");
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("Inside setTeamName ");
		this.teamName = teamName;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	// setter method for inject
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setFortuneService ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
