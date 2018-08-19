package com.ammy.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout()
	{
		return "Baseball players are fantastic..";
	}
	
	//Method Injection
	/*
	@Autowired
	public void doDailyFortune(FortuneService fortuneService)
	{
		System.out.println("I am in doDailyFortune()..");
		this.fortuneService=fortuneService;
		//return fortuneService;
	}*/
	
	@Override
	public String getDailyFortune()
	{
		return fortuneService.getDailyFortune();
	}
	

}
