package com.ayan.springdemo;

public class CricketCoach implements Coach {
    //create a private field for Fortune
	private FortuneService fortuneService;
	private String email;
	private String teamname;
	
	public void setEmail(String email) {
		System.out.println("Welcome to Constructor-With parameter -setEmail");
		this.email = email;
	}

	public void setTeamname(String teamname) {
		System.out.println("Welcome to Constructor-With parameter -setTeamname");
		this.teamname = teamname;
	}

	//create no-arg constructor
	public CricketCoach() {
		System.out.println("Welocme to the no-arg constructor..");
	}
	//create setter method for the FortuneService
	
	public String getEmail() {
		return email;
	}

	public String getTeamname() {
		return teamname;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Get Daily Hard Practice for Batting and Bowling";
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Welcome to Constructor-With parameter -setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		
		return "God day for the Cricketers!";
	}

}
