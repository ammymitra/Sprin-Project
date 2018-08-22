package com.ammy.springConfig.javacode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCricket")
public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach : This is default constructor ");
	}

	public CricketCoach(FortuneService thefortuneService)
	{
		fortuneService=thefortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Inside CricketCoach : Do fielding practice hard..";
	}
	
	public String getDailyFortune()
	{
		return fortuneService.getDailyFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	

}
