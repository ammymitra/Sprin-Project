package com.ammy.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	//Constructor Injection
	@Autowired
	
	public TennisCoach(@Qualifier("randomeFortuneService")FortuneService thefortuneService) {
		fortuneService=thefortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Practice your back hand";
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getDailyFortune();
	}
}
