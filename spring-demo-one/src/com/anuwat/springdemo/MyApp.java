package com.anuwat.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach theCoach = new TrackCoach(); // This still HardCode

		// use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
