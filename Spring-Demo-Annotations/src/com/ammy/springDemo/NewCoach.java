package com.ammy.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewCoach implements Coach {
	private FortuneService fortuneService;
  //Setter Injection
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "You are excelent";
	}

	public String getDailyFortune()
	{
		return fortuneService.getDailyFortune();
	}
}
