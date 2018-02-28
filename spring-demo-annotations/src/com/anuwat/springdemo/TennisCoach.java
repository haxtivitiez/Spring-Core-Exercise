package com.anuwat.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
// @Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// @Autowired
	// public TennisCoach(FortuneService thefortuneService) {
	// this.fortuneService = thefortuneService;
	// }

	public TennisCoach() {
		System.out.println("inside TennisCoach() ");
	}

	// define init
	@PostConstruct
	public void doMyStartupStaff() {
		System.out.println("inside doMyStartupStaff() ");
	}

	// define destroy
	@PreDestroy
	public void doMyCleanupStaff() {
		System.out.println("inside doMyCleanupStaff() ");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	// @Autowired
	// public void fuckFortune(FortuneService fortuneService) {
	// System.out.println("inside setFortuneService() ");
	// this.fortuneService = fortuneService;
	// }

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
