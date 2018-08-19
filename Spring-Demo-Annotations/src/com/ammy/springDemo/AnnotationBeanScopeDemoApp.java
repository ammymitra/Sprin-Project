package com.ammy.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load config file in spring container
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve the bean from spring container
		
		Coach theCoach=context.getBean("swimCoach",Coach.class);
		
		Coach alphpaCoach=context.getBean("swimCoach", Coach.class);
		
		//check if they are same or not
		
		boolean result= ( theCoach == alphpaCoach);
		
		//print the result
		
		System.out.println("\n Pointing to the same object  :"+result);
		
		System.out.println("\n Memory location for theCoach :"+theCoach);
		System.out.println("\n Memory location for alphaCoach :"+alphpaCoach);
		
		//close the context
		
		context.close();
	}

}
