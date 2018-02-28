package com.anuwat.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve a bean from spring container

		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call fortune service
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();

	}

}
