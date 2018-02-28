package com.anuwat.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve a bean from spring container

		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call fortune service
		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach.getEmailAddress());

		System.out.println(theCoach.getTeamName());
		// close the context
		context.close();
	}

}
