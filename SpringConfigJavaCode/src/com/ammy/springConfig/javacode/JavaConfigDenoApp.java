package com.ammy.springConfig.javacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDenoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new
				AnnotationConfigApplicationContext(SportConfig.class);
		
		CricketCoach theCoach=context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("Email :"+theCoach.getEmail());
		
		System.out.println("Team  :"+theCoach.getTeam());
		
		context.close();

	}

}
