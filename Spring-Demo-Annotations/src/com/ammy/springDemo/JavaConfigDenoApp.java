package com.ammy.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDenoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new
				AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach=context.getBean("cricketCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
