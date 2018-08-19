package com.ammy.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach {
   //Field Injection
	@Autowired
	@Qualifier("randomeFortuneService")
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		
		return "Practice bowling and batting both..";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

}
