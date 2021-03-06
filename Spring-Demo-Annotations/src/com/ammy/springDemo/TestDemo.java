package com.ammy.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("applicationContext.xml");
		//R
		Coach theCoach=context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
