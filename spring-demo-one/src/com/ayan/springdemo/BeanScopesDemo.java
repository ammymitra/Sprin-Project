package com.ayan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesDemo {

	public static void main(String[] args) {
		//Load the configuration file in the spring container
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("BeanScopes-applicationContext.xml");
		//Retieve Bean from the container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		Coach coach=context.getBean("myCoach", Coach.class);
		
		boolean result=(theCoach==coach);
		
		//print the result
		
		System.out.println("\n Pointying to the same object   : "+ result);
		System.out.println("\n Memory location for the theCoach "+theCoach);
		System.out.println("\n Memory location for the theCoach "+coach);
		//close the context
		context.close();
		
	}

}
