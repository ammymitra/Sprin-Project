package com.ayan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		//Load the configuration file in the spring container
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("BeanLifeCycle-applicationContext.xml");
		//Retieve Bean from the container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		//Print methods
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}

}
